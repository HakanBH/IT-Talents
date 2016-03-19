package Homework11.Bank;

public interface IBank {
	void acceptDeposit(Deposit d);
	void payInterest();
	boolean openCredit(Credit c) throws Exception;
}
