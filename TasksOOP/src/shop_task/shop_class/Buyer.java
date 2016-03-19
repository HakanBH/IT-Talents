package shop_class;

public class Buyer implements IBuyer{
	public static final int CART_CAPACITY = 50;
	private Shop shop;
	private double money;
	private int numberOfProducts;
	private Product[] cart;
	
	Buyer(Shop shop){
		if(shop!=null){
			this.shop=shop;
		}
		cart = new Product[CART_CAPACITY];
	}
	
	@Override
	public void addByWeight(ProductByWeight item, double weight) {
//		if(shop.hasProduct(item)){
//			if(shop.getProduct(item).getQuantity() > weight){
//				shop.removeByWeight(item, weight);
//			}
//		}
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
