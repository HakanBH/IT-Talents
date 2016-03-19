package loops_switch;
import java.util.Scanner;

//* Task5.1. Write a program that prints the digits of a given number on a separate lines.

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num!=0){
			System.out.println(Math.abs(num%10));
			num/=10;
		}
	}
}
