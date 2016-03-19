package Homework2_Loops;
import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n:");
		int n = sc.nextInt();
		for(int i=1, j=n-1; i<=n; i++, j+=2){
			for(int k=1;k<=n;k++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}