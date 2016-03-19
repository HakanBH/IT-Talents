package Homework2_Loops;
import java.util.Scanner;

public class Zad11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n:");
		int n = sc.nextInt();
		for(int i=1;i<=n*2;i+=2){
			for(int j=0; j<(n-i/2); j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
