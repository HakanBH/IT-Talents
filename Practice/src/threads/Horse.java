package threads;

public class Horse implements Runnable{
	private static final int sleepTime=100;
	
	public int getSleepTime() {
		return this.sleepTime;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " starts the race.");
		for(int i=0;i<100;i+=5){
			try {
				Thread.sleep(getSleepTime());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is at " + i + "m.");	
		}
		
		System.out.println(Thread.currentThread().getName() + " finished the race.");
	}
}
