package TraderTask;

public interface ITrader {	
	public abstract void makeOrder(Provider provider, TradeSite tradeSite);
	public abstract void payTaxes(TradeSite tradeSite);
	public abstract void takeProfit(TradeSite tradeSite);
}
