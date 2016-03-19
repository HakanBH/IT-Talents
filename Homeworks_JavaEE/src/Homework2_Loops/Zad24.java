package Homework2_Loops;
import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int helper = n;
		int reversed=0;
		do{
			int remainder = helper%10;
			reversed = reversed*10 + remainder;
			helper = helper/10;
		}
		while(helper!=0);
		if(n == reversed)
			System.out.println("The number is a palyndrome");
		else
			System.out.println("The number is not a palyndrome");
	}
}
