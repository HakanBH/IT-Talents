package PostOffice;

public abstract class MailObject {
	private Citizen from;
	private Citizen to;
	

	public MailObject(Citizen from, Citizen to) {
		setFrom(from);
		setTo(to);
	}
	
	public Citizen getFrom() {
		return from;
	}
	
	public Citizen getTo() {
		return to;
	}

	public void setFrom(Citizen from) {
		this.from = from;
	}

	public void setTo(Citizen to) {
		this.to = to;
	}
	
	public abstract double getTax();
	public abstract int getDeliveryTime();
	public abstract String getType();
	
	@Override
	public String toString() {
		return getType() + " from " + getFrom().getFirstName() + " to " + to.getFirstName() + ".";
	}
	
}
