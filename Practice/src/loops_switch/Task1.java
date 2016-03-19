package loops_switch;
// * Task1. Write a program that prints all numbers between -100 and 100. Then print them backwards.

public class Task1 {
	public static void main(String[] args) {
		for(int i=-100;i<=100;i++){
			System.out.print(i + " ");
		}
		System.out.println("");
		for(int i=100; i>=-100; i--){
			System.out.print(i + " ");
		}

	}

}
