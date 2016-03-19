package Homework2_Loops;
import java.util.Scanner;

public class Zad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете цяло число.");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=a;i++)
			sum+=i;
		System.out.println(sum);
	}
}
