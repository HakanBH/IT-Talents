package TraderTask;

public class SoleTraderWithPavilion extends SoleTrader{
	private Pavilion pavilion;
	public SoleTraderWithPavilion(String name) {
		super(name);
		pavilion = new Pavilion();
	}

	public SoleTraderWithPavilion(String name, Pavilion pavilion) {
		super(name);
		this.pavilion = pavilion;
	}
	
	//@Override
	public void payTaxes() {
		setCapital(getCapital()-Pavilion.PAVILION_TAX);
	}
}
