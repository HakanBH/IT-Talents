package TraderTask;

public class SoleTraderWithStand extends SoleTrader{
	private Stand stand;
	
	public SoleTraderWithStand(String name) {
		super(name);
		stand = new Stand();
	}

	public SoleTraderWithStand(String name,	Stand stand) {
		super(name);
		this.stand = stand;
	}
	
	//@Override
	public void payTaxes() {
		setCapital(getCapital() - Stand.STAND_TAX);
	}
}
