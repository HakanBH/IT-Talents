package Homework_Warehouse;


public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Warehouse sklad = new Warehouse();
		Supplier supplier = new Supplier(sklad);
		
		Shop fantastiko = new Shop(sklad);
		Thread[] clients = new Thread[9];

		for (int i = 0; i < 3; i++) {
			clients[i] = new Thread(new Client(fantastiko), "Client " + i+1);
		}
		new Thread(supplier).start();
		for(int i=0 ;i <3;i++){
			clients[i].start();
		}

		
// Тия работят по същия начин като първия магазин, затова не съм ги пуснал.
//		Shop billa = new Shop(sklad);
//		for (int i = 3; i < 6; i++) {
//			clients[i] = new Thread(new Client(billa, "Client " + i+1));
//		}
		
//		Shop kaufland = new Shop(sklad);
//		for (int i = 6; i < 9; i++) {
//			clients[i] = new Thread(new Client(kaufland, "Client " + i+1));
//		}
	}
}
