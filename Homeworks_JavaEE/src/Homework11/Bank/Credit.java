package Homework11.Bank;

public class Credit extends BankAccount{
	protected final static int DEFAULT_INTEREST = 10;

	private double creditSize;
	
	public Credit(int numberOfMonths, int interest){
		super(numberOfMonths,interest);
	}
	
	public Credit(double moneyInCard, int expirationPeriod) {
		super(moneyInCard, expirationPeriod);
		creditSize = moneyInCard;
		setInterest(DEFAULT_INTEREST);
	}

//месечната вноска се изчислява еднократно и е равна на % от размера на изтегления кредит
	public double getMonthlyPayment(){
		return (super.getInterest()*this.creditSize)/100;
	}
	
	public double getCreditSize(){
		return creditSize;
	}
	
	@Override
	public String toString() {
		return "Credit Size:" + getMoneyInCard() + "\t Interest: " 
				+ getInterest() + "%, Months until expiration: " + getExpirationPeriod();
	}
}
