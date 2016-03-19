package shop_class;

import java.util.Arrays;

public class Shop implements IShop {
	final static int CAPACITY = 500; // максимален брой продукти
	private String name;
	private String address;
	private double money;
	private Product[] products;
	private int currentProduct;

	Shop() {
		products = new Product[CAPACITY];
	}
	
	
	public Product[] getAllProducts(){
		return Arrays.copyOf(products, products.length);
	}
	
	public Product getProduct(Product item) {
		if (item != null) {
			for(int i=0; i<products.length; i++){
				if(products[i] !=null && item.getName().equals(products[i].getName())){
					return products[i];
				}
			}
		}
		return null;
	}	
	
	public boolean hasProduct(Product item){
		if(item!=null){
			for(int i=0; i<products.length; i++){
				if(products[i]!=null && item.getName().equals(products[i].getName())){
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public void addByWeight(ProductByWeight item, double weight) {
		
	}
	@Override
	
	public void removeByWeight(ProductByWeight item, double weight) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addByNumber(ProductByNumber item, int number) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void removeByNumber(ProductByNumber item, int number) {
		// TODO Auto-generated method stub	
	}
	
	
}
