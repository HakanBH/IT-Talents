package threads;

public class LimpHorse extends Horse implements Runnable{
	@Override
	public int getSleepTime() {
		return 2*super.getSleepTime();
	}
	
}
