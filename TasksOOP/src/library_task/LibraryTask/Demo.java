package LibraryTask;
import java.time.LocalDate;

public class Demo {
	public static void main(String[] args) throws Exception {
		Library biblioteka = new Library();

		biblioteka.addRead(new Textbook("Matematika 6 klas", "Anubis", LocalDate.now(), "Chavdar Lozanov", "Matematika"));		
		biblioteka.addRead(new Textbook("Matematika 7 klas", "Anubis", LocalDate.now(), "Chavdar Lozanov", "Matematika"));
		biblioteka.addRead(new Textbook("Istoriq 9 klas", "Anubis", LocalDate.now(), "Chavdar Lozanov", "Istoriq"));
		biblioteka.addRead(new Book("Odiseq", "Anubis", LocalDate.of(120,1,1), "Omir", "Mitologiq"));
		biblioteka.addRead(new Book("Antigona", "Anubis", LocalDate.of(100,1,1), "Omir", "Mitologiq"));
		biblioteka.addRead(new Book("Iliada", "Anubis", LocalDate.of(90, 1, 1), "Omir", "Mitologiq"));
//		biblioteka.addRead(new Magazine("Top Gear", "NZ", LocalDate.now(), "Koli", 5));
//		biblioteka.addRead(new Magazine("Top Gear", "NZ", LocalDate.now(), "Koli", 123));
//		biblioteka.addRead(new Magazine("Top Gear", "NZ", LocalDate.now(), "Koli", 1));
		
//		biblioteka.getCatalogue("Book");
		
		
		for(int i=0;i<5;i++){
			new Thread(new Client(biblioteka)).start();
		}
		
		Thread.sleep(10000);
		biblioteka.takenReads();
		
		System.out.println(biblioteka.giveRead());
	}
}
