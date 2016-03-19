package PostOffice;

public class Letter extends MailObject{
	private static final int LETTER_DELIVERY_TIME = 1000;
	private static final double LETTER_TAX = 0.5;

	private String content;
	
	
	public Letter(Citizen from, Citizen to) {
		super(from,to);	
	}
	
	
	@Override
	public int getDeliveryTime() {
		return LETTER_DELIVERY_TIME;
	}
	
	@Override
	public double getTax() {
		return LETTER_TAX;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		if(content!=null){
			this.content = content;
		}
	}
	
	@Override
	public String getType() {
		return "Letter";
	}
}
