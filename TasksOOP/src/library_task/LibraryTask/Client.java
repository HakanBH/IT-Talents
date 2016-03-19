package LibraryTask;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Client implements Runnable {
	private static final int MAX_RETURN_TIME = 10000;
	private static final int TIME_TO_TAKE_BOOK = 2000;
	private List<Read> takenBooks;
	private Library library;

	public Client(Library lib) {
		this.library = lib;
	}

	@Override
	public void run() {
		Random r = new Random();
		while (true) {
			Read read = library.giveRead();

			System.out.println(read.getName() + " taken from library.");
			try {
				Thread.sleep(r.nextInt(MAX_RETURN_TIME));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			library.returnRead(read);
		}
	}
}
