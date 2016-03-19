package TraderTask;

public abstract class SoleTrader extends Trader{
	public static final int MAX_PROVIDERS = 5;
		
	private Retailer[] retailers;

	public SoleTrader(String name) {
		super(name);
	}	
}
