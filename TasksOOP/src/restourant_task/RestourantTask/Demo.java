package RestourantTask;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		Restourant chiflika = new Restourant();
		
		Map<String, List<Product>> menu = chiflika.getMenu();
		
		for(String str: menu.keySet()){
			System.out.println("TYPE: " + str);
			for(Product prod: menu.get(str)){
				System.out.println(prod);
			}
		}
		
		Map<LocalDateTime, String> orders = new TreeMap<LocalDateTime, String>();
		orders.put(LocalDateTime.of(2016,1,1, 12, 10, 6), "1");
		orders.put(LocalDateTime.of(2016,1,1, 13, 20, 0), "2");
		orders.put(LocalDateTime.of(2016,1,1, 11, 30, 6), "3");
		orders.put(LocalDateTime.of(2016,1,1, 10, 40, 3), "4");
		
		
		for(String s : orders.values()){
			System.out.println(s);
		}
	}
}
