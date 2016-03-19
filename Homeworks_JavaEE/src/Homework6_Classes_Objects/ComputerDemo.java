package Homework6_Classes_Objects;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer lenovo = new Computer(2012,1500,true,1024,512,"Windows 7");
		Computer dell = new Computer(2008,1000,true,2048,1000,"Linux Mint");
		
		lenovo.changeOS("Ubuntu");
		dell.useMemory(100);

		if(lenovo.comparePrice(dell) == 0 ){
			System.out.println("The two computers have same prices.");
		}
		else{
			if(lenovo.comparePrice(dell) == 1){
				System.out.println("The lenovo is cheaper than the dell.");
			}
			else{
				System.out.println("The lenovo is more expensive than the dell.");
			}
		}
	}
}
