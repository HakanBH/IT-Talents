package threads;

public class HorseDemo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			new Thread(new Horse(), "Horse " + i).start();
		}
		
		for(int i=1;i<=5;i++){
			new Thread(new LimpHorse(),"Limp Horse " + i).start();
		}
	}
}
