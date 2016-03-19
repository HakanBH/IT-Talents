package Homework11.Bank;

public interface IClient {
	void openDeposit(double depositSize, int numberOfMonths) throws Exception;
	void payCredits();
	void demandCredit(double sum, int numberOfMonths) throws Exception;
	
}
