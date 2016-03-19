package PostOffice;

public class Package extends MailObject{
	private static final int OVERSIZED_TRESHOLD = 60;
	private static final int PACKAGE_DELIVERY_TIME = 1500;
	private static final double PACKAGE_TAX = 2.0;
	private static final int MAX_SIZE = 100;

	private int height;
	private int length;
	private int width;
	private boolean isFragile;
	
	public Package(Citizen from, Citizen to) {
		super(from, to);
		setHeight();
		setLength();
		setWidth();
		setFragile();
	}
	
	
	@Override
	public int getDeliveryTime() {
		return PACKAGE_DELIVERY_TIME;
	}
	
	@Override
	public double getTax() {
		double tax = PACKAGE_TAX;
		if(this.isOversized()){
			tax *= 1.5;
		}
		if(this.isFragile()){
			tax *= 1.5;
		}
		return tax;
	}
	
	@Override
	public String getType() {
		if(isFragile){
			return "Fragile Package";
		}
		else{
			return "Non-Fragile Package";
		}
	}
	
	public boolean isOversized(){
		return getHeight()>OVERSIZED_TRESHOLD || getWidth()>OVERSIZED_TRESHOLD || getLength()>OVERSIZED_TRESHOLD;
	}

	public boolean isFragile(){
		return isFragile;
	}
	
	public int getHeight() {
		return height;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setFragile(){
		this.isFragile = (Math.random()>0.5);
	}
	
	public void setHeight() {
		this.height = (int) (Math.random()*MAX_SIZE);
	}

	public void setLength() {
		this.length = (int) (Math.random()*MAX_SIZE);
	}

	public void setWidth() {
		this.width = (int) (Math.random()*MAX_SIZE);
	}
	
	@Override
	public String toString() {
		return getType() + " from " + getFrom().getFirstName() + 
				" to " + getTo().getFirstName();
	}
}
