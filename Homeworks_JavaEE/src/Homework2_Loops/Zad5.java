package Homework2_Loops;
import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете 2 различни цели числа");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
			for(int i=b ;i<=a ;i++)
				System.out.print(i + " ");
		else 
			for(int i=a; i<=b; i++)
				System.out.print(i + " ");
	}
}
