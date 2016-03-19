package Homework_Warehouse;

public class Warehouse extends TradeSite{
	private static final int DEFICIT_TRESHOLD = 10;
	private static final int NUMBER_OF_SUPPLIED_PRODUCTS= 25;	

	@Override
	public void supplyDeficitProducts(){
		for(String name : products.keySet()){
			if(isProductDeficit(name)){
				products.put(name, products.get(name) + NUMBER_OF_SUPPLIED_PRODUCTS);
				System.out.println("Warehouse supplied with " + NUMBER_OF_SUPPLIED_PRODUCTS + " " + name + "s");
			}
		}
		synchronized (this) {
			notifyAll();
		}
	}
	
	@Override
	public void sellProduct(String name, int quantity) {
		if(products.containsKey(name)){
			while(products.get(name) < quantity){
				try {
					synchronized(this){
						System.out.println("Warehouse is waiting for " + name + "s");
						wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			synchronized (this){
				products.put(name, products.get(name) - quantity);
				notifyAll();		
			}
		}
	}
	
	@Override
	public int getDeficitTreshold() {
		return DEFICIT_TRESHOLD;
	}

}
