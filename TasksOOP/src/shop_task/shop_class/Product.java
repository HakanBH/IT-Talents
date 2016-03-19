package shop_class;

public abstract class Product {
	private String name;
	private double price;
	
	Product(String name, double price){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
		if(price>0){
			this.price = price;
		}
	}
	
	public String getName(){
		return this.name;
	}
}
