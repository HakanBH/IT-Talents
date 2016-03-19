package Homework_Warehouse;

public class Shop extends TradeSite{
	private static final int DEFICIT_TRESHOLD = 5;
	private static final int NUMBER_OF_SUPPLIED_PRODUCTS=5;	

	private Warehouse warehouse;
	
	public Shop(Warehouse warehouse){
		super();
		setWarehouse(warehouse);
	}
	
	@Override
	public void supplyDeficitProducts(){
		for(String name : products.keySet()){
			if(isProductDeficit(name)){
				warehouse.sellProduct(name, NUMBER_OF_SUPPLIED_PRODUCTS);
				this.addProduct(name, NUMBER_OF_SUPPLIED_PRODUCTS);
				System.out.println("Shop supplied with " +  NUMBER_OF_SUPPLIED_PRODUCTS + " " + name + "s");
			}
		}
	}
	
	@Override
	public void sellProduct(String name, int quantity) {
		if(products.containsKey(name)){
			while(products.get(name) < quantity){
				try {
					synchronized(this){
						System.out.println("Shop is waiting for " + name + "s");
						wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			products.put(name, products.get(name) - quantity);
			this.supplyDeficitProducts();
			
			synchronized (this){
				notifyAll();		
			}
		}
	}
	
	@Override
	public int getDeficitTreshold() {
		return DEFICIT_TRESHOLD;
	}

	public void setWarehouse(Warehouse warehouse){
		if(warehouse!=null){
			this.warehouse=warehouse;
		}
	}
}
