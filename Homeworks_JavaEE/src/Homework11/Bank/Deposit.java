package Homework11.Bank;

public class Deposit extends BankAccount {
	protected final static int DEFAULT_INTEREST = 5;

	public Deposit(int expirationPeriod, int interest){
		super(expirationPeriod,interest);
	}
	
	public Deposit(double moneyInCard, int expirationPeriod){
		super(moneyInCard, expirationPeriod);
		setInterest(DEFAULT_INTEREST);
	}
	
	public Deposit(double moneyInCard, int expirationPeriod, int interest){
		super(moneyInCard, expirationPeriod, interest);
	}

	
	//сложна лихва - всеки месец се изчислява наново според парите в сметката
	public double getMonthlyPayment(){
		return (super.getInterest()*super.getMoneyInCard())/100;		
	}
	
	@Override
	public String toString() {
		return "Deposit Size:" + getMoneyInCard() + "\t Interest: " 
				+ getInterest() + "%, Months until expiration: " + getExpirationPeriod();
	}
}
