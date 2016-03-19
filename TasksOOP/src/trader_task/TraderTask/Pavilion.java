package TraderTask;

public class Pavilion extends TradeSite{
	public static final int MAX_AREA=6;
	public static final int MIN_AREA=4;
	public static final int PAVILION_TAX=50;
	
	Pavilion(){
		super(MIN_AREA,PAVILION_TAX);
	}
	
	Pavilion(int area,int  tax){
		super(area,tax);
	}
	
	public void setArea(int area) {
		if(area>MIN_AREA && area<=MAX_AREA){
			super.setArea(area);
		}
		else{
			super.setArea(MIN_AREA);				//default area
		}
	}
	
	@Override
	public void setTax(int tax) {
		super.setTax(PAVILION_TAX);
	}

	public static int getPavilionTax() {
		return PAVILION_TAX;
	}
}
