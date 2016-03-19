package shop_class;

public class ProductByWeight extends Product {
	private double weight;

	ProductByWeight(String name, double price, double weight) {
		super(name,price);
		if (weight > 0) {
			this.weight = weight;
		}
	}
	
	double getQuantity(){
		return this.weight;
	}
	
	void setQuantity(double quantity) {
		if(quantity>0){
			this.weight=quantity;
		}
	}
}
