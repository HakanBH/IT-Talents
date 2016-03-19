package RestourantTask;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Client extends Person implements Runnable {
	private static final int TIME_TO_EAT = 5000;
	private static final int TIME_TO_CHOOSE_ITEM = 1000;
	private Restourant restourant;

	public Client(String name, Double money, Restourant restourant) {
		super(name, money);
		setRestourant(restourant);
	}

	@Override
	public void run() {
		try {
			Waiter w =  restourant.assignWaiterToClient();
			Table t = restourant.giveTableToClient();
			Random r = new Random();
			try {
				Thread.sleep(r.nextInt(TIME_TO_CHOOSE_ITEM));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			orderSomething();
			// waiting for order to arrive

			try {
				Thread.sleep(r.nextInt(TIME_TO_EAT));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(w.isQkoParche()){
				giveTip(w, Math.random()*5 + 5);
			}else{
				giveTip(w, Math.random()*5);
			}
			
			synchronized(t){
				t.setIsOccupied(false);
			}
			
		} catch (Exception e1) {
			System.out.println("Sorry. We have no free tables at the moment!");
		}
	}

	public void giveTip(Waiter w, Double sum){
		w.changeBalance(sum);
	}
	
	public void orderSomething() {
		Map<String, List<Product>> menu = restourant.getMenu();
		Random r = new Random();

		if (Math.random() > 0.5) {
			List<Product> p = menu.get("Drink");
			restourant.orderProduct(p.get(r.nextInt(p.size())));
		}
		if (Math.random() > 0.5) {
			List<Product> p = menu.get("Appetizer");
			restourant.orderProduct(p.get(r.nextInt(p.size())));
		}
		if (Math.random() > 0.5) {
			List<Product> p = menu.get("Main");
			restourant.orderProduct(p.get(r.nextInt(p.size())));
		}
		if (Math.random() > 0.5) {
			List<Product> p = menu.get("Dessert");
			restourant.orderProduct(p.get(r.nextInt(p.size())));
		}
	}

	public Restourant getRestourant() {
		return restourant;
	}

	public void setRestourant(Restourant r) {
		if (r != null) {
			this.restourant = r;
		}
	}
}
