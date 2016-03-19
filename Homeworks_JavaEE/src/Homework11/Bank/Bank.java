package Homework11.Bank;

import java.util.HashSet;

public class Bank implements IBank{
	private String name;
	private String address;
	private HashSet<BankAccount> products;		//по-добре е с 2 колекции за дебитни и кредитни карти
	private double moneyInBank;

	public Bank(String name, String address, double money) throws Exception{
		setName(name);
		setAddress(address);
		addMoneyToBank(money);
		products = new HashSet<BankAccount>();
	}
	
	@Override
	public void acceptDeposit(Deposit d) {
		products.add(d);
		moneyInBank += d.getMoneyInCard();
		//банковия резерв се увеличава с 10% от стойността на депозита.
	}
	
	@Override
	//изплащане на лихви по всичките дебитни карти
	public void payInterest() {
		for(BankAccount b : products){
			if(b instanceof Deposit){
				b.addMoneyToCard(b.getMoneyInCard()*b.getInterest());
				moneyInBank -= b.getMoneyInCard()*b.getInterest();
			}
		}
	}
	
	@Override
	//отпускане на кредит за определена сума и период
	public boolean openCredit(Credit c){
		if(c.getCreditSize() > this.getBankReserve()){
			System.err.println("Sorry. Our bank can't give such credit right now.");
			return false;
		}
		else{
			products.add(c);
			moneyInBank-=c.getCreditSize();
			return true;
		}
	}
	
	//изчислява банковия резерв - 10 % от всички депозити
	public double getBankReserve(){
		double deposits = 0;
		for(BankAccount a : products){
			if(a instanceof Deposit){
				deposits += a.getMoneyInCard();
			}
		}
		return deposits*0.1;
	}
	
	public void printAccountsInfo(){
		System.out.println("Credits and deposits in bank: ");
		for(BankAccount b: products){
			if(b instanceof Deposit){
				System.out.println(b);

			}
		}
		for(BankAccount b: products){
			if(b instanceof Credit){
				System.out.println(b);

			}
		}
	}

	@Override
	public String toString() {
		return	name + " Bank:   Money: " + moneyInBank + 
				", Reserve " + this.getBankReserve();
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) throws Exception{
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}else{
			throw new Exception("Invalid value for name!");
		}
	}

	public void setAddress(String address) throws Exception{
		if(address!=null && !address.isEmpty()){
			this.address = address;
		}else{
			throw new Exception("Invalid value for address!");
		}
		
	}
	
	public void addMoneyToBank(double sum){
		if(sum>0){
			moneyInBank+=sum;
		}
	}
}
