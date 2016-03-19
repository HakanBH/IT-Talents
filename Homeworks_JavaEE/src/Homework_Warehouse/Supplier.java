package Homework_Warehouse;

public class Supplier implements Runnable{
	private	Warehouse warehouse;
	
	public Supplier(Warehouse warehouse){
		setWarehouse(warehouse);
	}
	
	@Override
	public void run() {
		while(true){
			while(!warehouse.hasDeficitProducts()){
				synchronized (warehouse) {
					try {
						warehouse.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			warehouse.supplyDeficitProducts();
			
			synchronized (warehouse) {
				warehouse.notifyAll();
			}
		}	
	}
	
	public void setWarehouse(Warehouse warehouse) {
		if(warehouse!=null){
			this.warehouse = warehouse;
		}
	}
}
