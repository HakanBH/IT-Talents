package RestourantTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Restourant {
	private Map<String, List<Product>> menu;
	private List<Cook> cooks;
	private List<Waiter> waiters;
	
	public Restourant(){
		cooks = new ArrayList<Cook>();
		cooks.add(new Cook("Gordon Ramsey", 10));
		cooks.add(new Cook("Shishkov", 2));
		cooks.add(new Cook("Shef Manchev", 3));
		cooks.add(new Cook("Uti Buchvarov", 6));
		
		waiters = new ArrayList<Waiter>();
		for(int i=1;i<=5;i++){
			new Waiter("Waiter " + i, 0.0);
		}
		
		menu = new HashMap<String, List<Product>>();
		menu.put("drink", new LinkedList<Product>((Arrays.asList(new Drink("Whiskey", 5.0),
				new Drink("Coca-Cola", 2.0), new Drink("Water",1.5), new Drink("Coffee", 2.0)))));
		menu.put("desert", new LinkedList<Product>(Arrays.asList(new Desert("Ice Cream", 4.0),
				new Desert("Cake", 5.0))));
		menu.put("appetizer", new LinkedList<Product>(Arrays.asList(new Appetizer("French fries", 3.0),
				new Appetizer("Cesar Salad", 4.2))));
		menu.put("main", new LinkedList<Product>(Arrays.asList(new MainDish("Chicken", 10.0), new MainDish("Beef steak", 15.0),
				new MainDish("Fish", 12.0))));
	}
	
	public Map<String, List<Product>> getMenu(){
		Map<String,List<Product>> result = new HashMap<String,List<Product>>();
		for(String type:menu.keySet()){
			List<Product> products = Collections.unmodifiableList(menu.get(type));
			result.put(type, products);
		}
		return result;
	}

	public boolean hasFreeTables() throws Exception{
		for(Waiter waiter : waiters){
			if(waiter.hasFreeTables()){
				return true;
			}
		}
		throw new Exception("No free tables.");
	}
	
	public Table giveTableToClient() throws Exception{
		Table table = new Table();
		for(Waiter w : waiters){
			if(w.hasFreeTables()){
				table = w.giveTableToClient();
			}
		}
		return table;
	}
	
	public void orderProduct(Product product) {
		
	}

	public Waiter assignWaiterToClient() throws Exception {
		for(Waiter w : waiters){
			if(w.hasFreeTables()){
				return w;
			}
		}
		throw new Exception("No free tables.");
	}
}
