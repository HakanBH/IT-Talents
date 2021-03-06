package LibraryTask;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Library implements Runnable {
	private static final int REVISION_INTERVAL = 30000;
	private Map<String, Map<String, List<Read>>> reads;
	private Librarian librarian;

	public int numberOfAvailableReads;

	public Library() {
		librarian = new Librarian();
		new Thread(librarian).start();

		reads = new HashMap<String, Map<String, List<Read>>>();

		reads.put("Book", new TreeMap<String, List<Read>>());
		reads.put("Textbook", new TreeMap<String, List<Read>>());
		reads.put("Magazine", new TreeMap<String, List<Read>>());
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(REVISION_INTERVAL);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean hasRead(Read r) {
		Map<String, List<Read>> type = reads.get(r.getType());
		if (type.containsKey(r.getCategory())) {
			return type.get(r.getCategory()).contains(r);
		}
		return false;
	}

	public Read giveRead() {
		Random rand = new Random();
		String type = new String();
		if(Math.random()>0.5){
			type="Book";
		}
		else{
			type="Textbook";
		}
		Map<String, List<Read>> readsFromThisType = reads.get(type);
	
		Object[] categories = readsFromThisType.keySet().toArray();
		String randomCategory = (String) categories[rand.nextInt(categories.length)];
		List<Read> readsFromThisCategory = readsFromThisType.get(randomCategory);

		Read randomRead = readsFromThisCategory.get(rand.nextInt(readsFromThisCategory.size()));
		
		synchronized (reads) {
			if (!randomRead.isTaken()) {
				randomRead.setTaken();
				librarian.addRead(randomRead);
			}
		}
		return randomRead;
	}

	public void returnRead(Read r) {
		if (hasRead(r)) {
			r.setTaken();
			System.out.println("You must pay " + librarian.getMoneyToPay(r) + "for this book.");
			librarian.removeRead(r);
		}

	}

	public void getCatalogue(String readType) {
		Map<String, List<Read>> catalog = reads.get(readType);
		System.out.println("Catalogue of all " + readType + "s");
		for (String category : catalog.keySet()) {
			System.out.println(category);
			List<Read> items = catalog.get(category);

			Collections.sort(items, items.get(0).getComparator());
			for (Read r : items) {
				System.out.println(r);
			}
		}
	}

	public void addRead(Read r) {
		if (r != null) {
			synchronized (reads) {
				if (!reads.get(r.getType()).containsKey(r.getCategory())) {
					reads.get(r.getType()).put(r.getCategory(), new ArrayList<Read>());
				}
				reads.get(r.getType()).get(r.getCategory()).add(r);
			}
			
			numberOfAvailableReads++;
		}
	}

	public void takenReads() {
		PrintWriter x = null;
		try {
			x = new PrintWriter("src/takenReads.txt");
			x.println("Number of taken reads " + librarian.getTakenReadsNumber());
			for (Read r : librarian.getTakenReads()) {
				x.println(r);
			}
			x.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
