package loops_switch;
import java.util.Scanner;

//* Task4. Write a program that tells you if a number is prime.

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = sc.nextInt();
		if(num<1){
			System.err.println("Error! Number must be positive.");
			return;
		}
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime && num!=1){
			System.out.println(num + " is a prime number");
		}
		else{
			System.out.println(num + " is not a prime number.");
		}
		sc.close();
	}
}
