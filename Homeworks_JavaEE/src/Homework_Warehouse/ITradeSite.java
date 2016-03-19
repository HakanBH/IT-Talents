package Homework_Warehouse;

public interface ITradeSite {
	public int getDeficitTreshold();
	
	public boolean isProductDeficit(String name);
	public boolean hasDeficitProducts();

	public void supplyDeficitProducts();
	
	public void sellProduct(String name, int quantity);

	public int getProductQuantity(String name);
	
	public void addProduct(String name, int quantity);
}
