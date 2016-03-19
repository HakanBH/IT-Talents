package Homework6_Classes_Objects;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		isNotebook = false;
		operationSystem = "Win XP";
	}
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		if(year > 2000){
			this.year = year;
		}
		if(price >= 0){
			this.price = price;
		}
		if(hardDiskMemory >= 0){
			this.hardDiskMemory = hardDiskMemory;
		}
		if(freeMemory >= 0 && freeMemory < this.hardDiskMemory){
			this.freeMemory = freeMemory;
		}
	}
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this(year,price,hardDiskMemory,freeMemory);
		this.isNotebook = isNotebook;
		if(operationSystem != null && !operationSystem.isEmpty()){				// може и с changeOS(opearationSystem);
			this.operationSystem = operationSystem;						
		}
	}
	
	int comparePrice(Computer c){
		if(c == null){
			return 1;
		}
		else{
			if(this.price == c.price){
				return 0;
			}
			if(this.price > c.price){
				return -1;
			}
			else{
				return 1;
			}
		}
	}
	
	void changeOS(String newOS){
		if(newOS != null && !newOS.isEmpty()){
			this.operationSystem=newOS;
		}
	}
	void useMemory(int memory){
		if(memory > this.freeMemory){
			System.out.println("Not enough free memory.");
		}
		else{
			this.freeMemory -= memory;
		}
	}
	void print(){
		System.out.println("Year : " + year);
		System.out.println("Price: " + price);
		System.out.println("Is notebook ? " + isNotebook);
		System.out.println("Hard disk memory: " + hardDiskMemory);
		System.out.println("Free memory: " + freeMemory);
		System.out.println("OS: " + operationSystem);
	}
}
