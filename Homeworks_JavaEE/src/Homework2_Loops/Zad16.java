package Homework2_Loops;
import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете 2 числа от интервала [10,5555]");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=b;i>=a;i--){
			if(i%50==0){
				System.out.print(i + " ");
			}
		}
	}
}
