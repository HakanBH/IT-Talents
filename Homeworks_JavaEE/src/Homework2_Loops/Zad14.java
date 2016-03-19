package Homework2_Loops;
import java.util.Scanner;

public class Zad14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност за N в интервала [10,200]");
		int n = sc.nextInt();
		for(int i=n;i>=7;i--){
			if(i%7 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
