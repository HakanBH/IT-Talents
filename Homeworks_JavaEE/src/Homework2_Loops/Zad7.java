package Homework2_Loops;
import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i*3 + " ");
		}
	}
}
