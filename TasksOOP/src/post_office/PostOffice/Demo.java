package PostOffice;

import java.time.LocalDate;

public class Demo {
	public static void main(String[] args) throws Exception {
		PostOffice office = new PostOffice();
		
		Citizen hakan = new Citizen("Hakan", "Hyusein", "ul. Iskur vh.1 ap.1", office);
		new Thread(hakan).start();
	
			
		
		boolean flag = true;
		while(flag){
			Thread.sleep(15000);
			hakan.setFlag(false);
			
			Thread.sleep(500);
			for(MailObject x : office.getMailsByDate(LocalDate.now())){
				System.out.println(x);
			}
			
			System.out.println("\nPERCENTEGE OF LETTERS: " + office.getPercentegeOfLettersToday());
			System.out.println("\nPERCENTEGE OF FRAGILE PACKAGES: " + office.getPercentegeOfFragilePackages());
			flag=false;
		}
	}
}
