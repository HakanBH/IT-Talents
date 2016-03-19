package PostOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Collector extends Postman{
	private static final int MAX_MAILS = 50;
	private static final int MIN_EXPERIENCE = 0;
	
	public Collector(String firstName, String lastName, String address, PostOffice post) throws Exception {
		super(firstName, lastName, address, post);
	}
	
	@Override
	public void run() {
		while(true){
			while(getPostOffice().getNumberOfMails() > MAX_MAILS){
				synchronized(getPostOffice()){
					try {
						getPostOffice().wait();
						System.out.println("Collector is waiting for mails to drop below " + MAX_MAILS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			// start collecting mails
			List<Mailbox> mailboxes = getPostOffice().getMailboxes();
			List<MailObject> lettersCollected = new ArrayList<MailObject>();
			for(Mailbox mailbox : mailboxes){
				lettersCollected.addAll(mailbox.takeAllLetters());
				System.out.println("Letters taken from mailbox. ");
			}
		
			getPostOffice().addMails(lettersCollected);
			System.out.println("Collector added letters to post office. ");
			
			synchronized(getPostOffice()){
				getPostOffice().notifyAll();
			}
		}
	}
	
	@Override
	public void setExperience(int e) {
		super.setExperience(e);
	}
	
}
