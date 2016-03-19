package threads;

public class PeshoHakera implements Runnable {

	private static final double MONEY_TO_GET = 20;
	private Account account;

	public PeshoHakera(Account acc) {
		this.account = acc;
	}

	@Override
	public void run() {
		System.out.println("Stealing " + MONEY_TO_GET + "$.");
		
		account.withdraw(MONEY_TO_GET);
		
	}
}
