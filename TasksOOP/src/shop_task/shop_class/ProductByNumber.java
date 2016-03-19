package shop_class;

public class ProductByNumber extends Product {
	private  int number;

	ProductByNumber(String name, double price, int number) {
		super(name, price);
		if (number > 0) {
			this.number = number;
		}
	}
	
	
	int getQuantity() {
		return this.number;
	}
	
	void setQuantity(int quantity) {
		if(quantity>0){
			this.number=quantity;
		}
		
	}
}
