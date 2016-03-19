package loops_switch;
// * Task2. Write a program that prints all odd numbers between 0 and 50 and all even numbers between 51 and 100.

public class Task2 {
	public static void main(String[] args) {
		for(int i=1;i<=49;i++){
			if(i%2!=0){
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		for(int i=52;i<=100;i++){
			if(i%2==0){
				System.out.print(i + " ");
			}
		}
	}

}
