package threads;

public class Account {
	private double cash;

	Account(double cash) {
		setCash(cash);
	}

	public void withdraw(double sum) {
		synchronized (this) {
			if (cash >= sum) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				;

				cash -= sum;
				System.out.println(this.cash + "$ left.");
			} else {
				System.out.println("Not enough money in card;");
			}
		}

	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public double getCash() {
		return cash;
	}
}
