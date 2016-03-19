package Homework2_Loops;
import java.util.Scanner;

public class Zad15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за N");
		int n = sc.nextInt();
		int sum = 0;;
		do{
			sum+=n;
			n--;
		}
		while(n>0);
		System.out.println(sum);
	}
}
