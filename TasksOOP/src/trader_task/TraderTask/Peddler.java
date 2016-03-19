package TraderTask;

//амбулантен търговец
public class Peddler extends Trader {	
	private Retailer retailer;
	
	Peddler(String name){
		super(name);
	}

	@Override
	public void makeOrder(Provider provider, TradeSite tradeSite) {
		// TODO Auto-generated method stub
		super.makeOrder(provider, tradeSite);
	}
}
