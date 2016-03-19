package LibraryTask;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Librarian implements Runnable {

	private Map<Read, Double> takenReads;

	public Librarian() {
		takenReads = new HashMap<Read, Double>();
	}
	
	public double getMoneyToPay(Read r){
		synchronized(takenReads){
			return takenReads.get(r);
		}
	}

	public void addRead(Read r) {
		synchronized (takenReads) {
			try {
				takenReads.put(r, r.getTax());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeRead(Read r) {
		if (r != null && takenReads.containsKey(r)) {
			synchronized (takenReads) {
				takenReads.remove(r);
			}
		}
	}
	
	public Set<Read> getTakenReads(){
		return new TreeSet<Read>((o1,o2)->{
			return o1.getTimeTaken().compareTo(o2.getTimeTaken());
		});
	}
	
	public int getTakenReadsNumber(){
		return takenReads.size();
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				for (Read r : takenReads.keySet()) {
					int maxSeconds = r.getMaxSeconds();
					LocalDateTime timeTaken = r.getTimeTaken();
					Duration d = Duration.between(timeTaken, LocalDateTime.now());

					if (d.getSeconds() > maxSeconds) {
						int overdueSeconds = (int) (d.getSeconds() - maxSeconds);
						double newTax = (r.getTax()*0.01)*overdueSeconds;
						synchronized(takenReads){
							takenReads.put(r, newTax);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
