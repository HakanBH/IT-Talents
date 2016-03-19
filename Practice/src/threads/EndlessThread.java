package threads;

import java.util.concurrent.atomic.AtomicBoolean;

public class EndlessThread implements Runnable{
	AtomicBoolean condition = new AtomicBoolean(true);
	
	@Override
	public void run() {
		while(condition.get()){
			System.out.println("Condition is true.");
		}
	}
}
