package TraderTask;

public class Product {
	private int price;
	private String name;
	
	Product(String name, int price){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		if(price>0){
			this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
