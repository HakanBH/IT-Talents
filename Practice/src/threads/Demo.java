package threads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account(100);
		
		ThreadGroup hackers = new ThreadGroup("Hackers");
		
		for(int i=0;i<10;i++){
			Thread hacker = new Thread(hackers, new PeshoHakera(acc));
			hacker.start();
		}
		
		Thread.sleep(500);
		
		hackers.interrupt();
		
//		EndlessThread t = new EndlessThread();
//		new Thread(t).start();
//		
//		Thread.sleep(1000);
//		
//		t.condition.set(false);
//		System.out.println("Condition is false");
	}
}
