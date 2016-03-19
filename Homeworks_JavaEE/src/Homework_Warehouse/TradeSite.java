package Homework_Warehouse;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TradeSite implements ITradeSite{
	private static final int DEFAULT_QUANTITY = 15;

/* 	 използвам String вместо Product, т.к. не използваме типа никъде и в класа Product 
 *   остава 1 String. Иначе трябва да пиша всеки път product.getName()... 
 *   Иначе първо Product бях го направил с factory method, в който според името се определя типа.
 */
	
	Map<String, Integer> products = new ConcurrentHashMap<String,Integer>();

	public TradeSite() {
		for(String name : Arrays.asList("banana", "orange", "apple")){
			products.put(name, DEFAULT_QUANTITY);	
		}
		for(String name: Arrays.asList("potato", "eggplant", "cucumber")){
			products.put(name, DEFAULT_QUANTITY);	
		}
		for(String name :Arrays.asList("pork", "beef", "chicken")){
			products.put(name, DEFAULT_QUANTITY);	
		}
	}	
	
	@Override
	public boolean isProductDeficit(String name){
		return products.get(name) < this.getDeficitTreshold(); 
	}	

	
	@Override 
	public int getProductQuantity(String name){
		if(products.containsKey(name)){
			return products.get(name);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		for(Entry<String,Integer> entry: products.entrySet()){
			res.append(entry.getKey() + ", " + entry.getValue()+"\n");
		}
		return res.toString();
	}
	
	@Override 
	public void addProduct(String name, int quantity){
		if(this.products.containsKey(name)){
			products.put(name, products.get(name)+quantity);
		}
	}
	
	@Override 
	public boolean hasDeficitProducts(){
		for(Entry<String,Integer> entry : products.entrySet()){
			if(products.get(entry.getKey()) < this.getDeficitTreshold()){
				return true;
			}
		}
		return false;
	}
}
