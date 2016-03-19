package TraderTask;

import java.util.Random;

public abstract class Trader extends Person implements ITrader{
	public static final int MAX_PRODUCTS = 50;
	public static final int MAX_PRICE = 15;
	public static final int MIN_PRICE=5;
	
	private Provider[] providers;
	private int capital;
	
	Trader(String name){
		super(name);
		setCapital(0);
	}
	
	Trader(String name, int capital){
		super(name);
		setCapital(capital);
	}
	
	public int getCapital(){
		return capital;
	}
	
	public void setCapital(int capital){
		if(capital>=0){
			this.capital = capital;
		}
	}
	
	@Override
	public void makeOrder(Provider provider, TradeSite tradeSite) {
		Random r = new Random();
		int numberOfProducts = r.nextInt(MAX_PRODUCTS) + 1;
		Product[] products = new Product[numberOfProducts];
		int priceOfAllProducts = 0;
		for(int i = 0; i<numberOfProducts ; i++){
			int productPrice = r.nextInt(MAX_PRICE)+MIN_PRICE+1;
			products[i] =  new Product("Product " + i, productPrice);
			tradeSite.addProduct(products[i]);
			priceOfAllProducts += productPrice;
		}
		if(provider instanceof Supplier){
			priceOfAllProducts -= (15/priceOfAllProducts)/100;
		}
		if(priceOfAllProducts >= getCapital()/2){
			System.out.println("Price of products is over 50% of your capital.");
			return;
		}
		else{
			setCapital(getCapital()-priceOfAllProducts);
		}
	}
	
	public void takeProfit(TradeSite tradeSite){
		capital += tradeSite.calculateProfit();
	}

	@Override
	public void payTaxes(TradeSite tradeSite) {
		capital -= tradeSite.getTax();
	}
}
