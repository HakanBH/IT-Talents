package Homework2_Loops;
import java.util.Scanner;

public class Zad25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число");
		int x = sc.nextInt();
		int fact=1;
		do{
			fact *= x;
			x--;
		}
		while(x>0);
		System.out.println(fact);
	}
}
