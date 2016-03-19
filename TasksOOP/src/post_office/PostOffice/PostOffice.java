package PostOffice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PostOffice {
	private static final int NUMBER_OF_MAILBOXES = 25;
	private static final int NUMBER_OF_POSTMEN = 1;
	private static final int NUMBER_OF_COLLECTORS = 1;

	private Map<LocalDate, List<MailObject>> archive;
	private List<MailObject> mailsInOffice;
	private List<Mailbox> mailboxes;
	private List<Postman> employees;

	PostOffice() throws Exception {
		mailboxes = new LinkedList<Mailbox>();
		for (int i = 0; i < NUMBER_OF_MAILBOXES; i++) {
			mailboxes.add(new Mailbox());
		}

		mailsInOffice = new ArrayList<MailObject>();
		archive = new HashMap<LocalDate, List<MailObject>>();
		employees = new LinkedList<Postman>();
		for (int i = 0; i < NUMBER_OF_COLLECTORS; i++) {
			employees.add(new Collector("Collector ", new String("" + i), "nqma zn", this));
//			/new Thread(employees.get(i)).start();;
		}
		for (int i = 0; i < NUMBER_OF_POSTMEN; i++) {
			employees.add(new Postman("Postman ", new String("" + i), "nqma zn", this));
			new Thread(employees.get(1)).start();;
		}
	}

	public int getNumberOfMails() {
		synchronized (mailsInOffice) {
			return mailsInOffice.size();
		}
	}

	public List<Mailbox> getMailboxes() {
		return mailboxes;
	}

	public void addMail(MailObject mail) {
		if (mail != null) {
			synchronized (archive) {
				if (!archive.containsKey(LocalDate.now())) {
					archive.put(LocalDate.now(), new ArrayList<MailObject>());
				}
				archive.get(LocalDate.now()).add(mail);
			}
			synchronized (mailsInOffice) {
				mailsInOffice.add(mail);
			}
		}
	}

	public void addMails(List<MailObject> mails) {
		if (mails != null) {
			for (MailObject m : mails) {
				this.addMail(m);
			}
		}
	}

	public List<MailObject> takeMails() {
		int numberOfMailsPerPostman = this.getNumberOfMails() / NUMBER_OF_POSTMEN;
		List<MailObject> toDistribute = new ArrayList<MailObject>();
		synchronized (mailsInOffice) {
			toDistribute = mailsInOffice.subList(0, numberOfMailsPerPostman);
			mailsInOffice.remove(toDistribute);
		}
		return toDistribute;
	}
	
	public List<MailObject> getMailsByDate(LocalDate date) throws Exception{
		if(archive.containsKey(date)){
			List<MailObject> result = archive.get(date);
			return result;
		}else{
			throw new Exception("No mails on this date. ");
		}
	}
	
	public int getPercentegeOfLettersToday(){
		int numberOfLetters = 0;
		List<MailObject> mailsToday = archive.get(LocalDate.now());
		for(MailObject mail : mailsToday){
			if(mail instanceof Letter){
				numberOfLetters++;
			}
		}
		return (numberOfLetters*100)/mailsToday.size();
	}
	
	public int getPercentegeOfFragilePackages(){
		int numberOfPackages = 0;
		int numberOfFragilePackages = 0;
		for(List<MailObject> mails : archive.values()){
			for(MailObject mail : mails){
				if(mail instanceof Package){
					numberOfPackages++;
					if(((Package) mail).isFragile()){
						numberOfFragilePackages++;
					}
				}
			}
		}
		return (numberOfFragilePackages*100)/numberOfPackages;
	}
	
	public List<Postman> getPostmanInfo(){
		List<Postman> postmen = new ArrayList<Postman>();
		for(Postman p: employees){
			if(!(p instanceof Collector)){
				postmen.add(p);
			}
		}
		Collections.sort(postmen, (o1,o2)->{
			return o1.getNumberOfMailsDeliverd() - o2.getNumberOfMailsDeliverd();
		});
		
		return postmen;
	}
}
