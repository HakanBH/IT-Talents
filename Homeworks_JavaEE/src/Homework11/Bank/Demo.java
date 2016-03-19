package Homework11.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
	public static void main(String[] args) throws Exception {
		Random r = new Random();
		
		BankAccount shortDeposit = new Deposit(3,3);
		BankAccount longDeposit = new Deposit(12,5);
		BankAccount homeCredit = new Credit(24,6);
		BankAccount consumerCredit = new Credit(24,10);
	
		Bank bgBank = new Bank("DSK","ul. Na Bankata Ulicata",100_000);
		
		List<Client> clients = new ArrayList<Client>();
		for(int i=1; i<=10; i++){
			Client c = new Client("Client No " + i, bgBank);
			c.setMoney(r.nextInt(10000));
			
			c.setSalary(300+r.nextInt(2000));
			System.out.println(c);
			clients.add(c);
		}
		
		System.out.println("\n"+bgBank +"\n");
		for(Client c: clients){
			int depositSize = r.nextInt(21)+80;
			c.openDeposit(c.getMoney()*depositSize/100, 12);
			System.out.println(c);
		}
		
		System.out.println("\n"+bgBank +"\n");
		
		for(Client c: clients){
			c.demandCredit(r.nextInt(5000), 24);	//максимален кредит-5000лв.
			System.out.println(c);
		}
		
		System.out.println("\n"+bgBank +"\n");
		bgBank.printAccountsInfo();
	}
}
