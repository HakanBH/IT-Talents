package TraderTask;

public class MallShop extends TradeSite{
	public static final int MAX_AREA=100;
	public static final int MIN_AREA=10;
	public static final	int MALL_SHOP_TAX=150;

	MallShop(){
		super(MIN_AREA, MALL_SHOP_TAX);
	}
	
	
	MallShop(int area, int tax){
		super(area,tax);
	}
	
	public void setArea(int area) {
		if(area>MIN_AREA && area<=MAX_AREA){
			super.setArea(area);
		}
	}
	
	
	
	@Override
	public void setTax(int tax) {
		super.setTax(MALL_SHOP_TAX);
	}
}
