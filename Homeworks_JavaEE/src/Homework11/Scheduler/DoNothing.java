package Homework11.Scheduler;

public class DoNothing implements Task{

	@Override
	public void doWork() {
		System.out.println("Doing nothing...");
	}
	
}
