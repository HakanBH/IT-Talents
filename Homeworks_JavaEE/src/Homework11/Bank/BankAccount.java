package Homework11.Bank;

public abstract class BankAccount {
	private String name;
	private int interest; 		// лихвен процент 
	
	private int expirationPeriod;
	private double moneyInCard;
	
	public BankAccount(int expirationPeriod, int interest){
		this.expirationPeriod=expirationPeriod;
		setInterest(interest);
	}
	
	public BankAccount(double moneyInCard, int expirationPeriod){
		setMoneyInCard(moneyInCard);
		this.expirationPeriod=expirationPeriod;		
	}
	
	public BankAccount(double moneyInCard, int expirationPeriod, int interest){
		this(moneyInCard, expirationPeriod);
		setInterest(interest);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
	}
	
	public double getMoneyInCard() {
		return moneyInCard;
	}

	public void setMoneyInCard(double moneyInCard) {
		this.moneyInCard = moneyInCard;
	}
	public void addMoneyToCard(double amountToAdd){
		if(amountToAdd>0){
			moneyInCard+=amountToAdd;
		}else{
			System.out.println("The amount must be a positive number.");
		}
	}
	
	public int getExpirationPeriod(){
		return expirationPeriod;
	}
	
	public void setInterest(int interest){
		this.interest=interest;
	}
	
	public int getInterest() {
		return interest;
	}
	
	
}
