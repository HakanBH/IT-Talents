package TraderTask;

import java.util.Random;

public abstract class TradeSite {
	public static final int OPENING_HOUR = 8;	//DEFAULT_OPENING_HOUR
	public static final int CLOSING_HOUR = 20;	//DEFAULT_CLOSING_HOUR
	public static final int MAX_PRODUCTS = 1000;
	
	private String address;
	private WorkingHours workingHours;
	private int area;
	private int tax;
	private Product[] products;
	
	private int numberOfProducts;
	
	private static void func(){
		
	}
	TradeSite(int area, int tax){
		setArea(area);
		setTax(tax);
		setWorkingHours(OPENING_HOUR, CLOSING_HOUR);
		products = new Product[MAX_PRODUCTS];
	}
	
	public void addProduct(Product newProduct){
		if(newProduct!=null && numberOfProducts < MAX_PRODUCTS){
			products[numberOfProducts++] = newProduct;
		}
	}

	public void sellProduct(Product product){
		for(int i=0;i<numberOfProducts; i++){
			if(products[i]!=null && products[i].equals(product)){
				products[i] = null;
			}
		}
	}
	
	public int calculateProfit(){
		Random rand = new Random();
		int r = rand.nextInt(numberOfProducts);
		int profit = 0;
		for(int i=0; i<r;i++){
			profit += products[i].getPrice();
		}
		return (int)(profit*1.3);
	}
	
	public void setWorkingHours(int open, int close){
		workingHours = new WorkingHours(open,close);
	}
	
	public void setArea(int area){
		this.area = area;
	}
	
	public void setTax(int tax){
		if(tax>0){
			this.tax = tax;
		}
	}
	
	public int getTax(){
		return tax;
	}
}
