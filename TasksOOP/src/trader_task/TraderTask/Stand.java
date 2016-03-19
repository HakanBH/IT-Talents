package TraderTask;

public class Stand extends TradeSite{
	public static final int MAX_AREA=10;
	public static final int MIN_AREA=2;
	public static final int STAND_TAX=50;

	Stand(){
		super(MIN_AREA, STAND_TAX);
	}
	
	Stand(int area, int tax){
		super(area,tax);
	}
	
	@Override
	public void setArea(int area) {
		if(area>MIN_AREA && area<=MAX_AREA){
			super.setArea(area);
		}
		else{
			super.setArea(MIN_AREA);			//default area
		}
	}
	
	@Override
	public void setTax(int tax) {
		super.setTax(STAND_TAX);
	}
}
