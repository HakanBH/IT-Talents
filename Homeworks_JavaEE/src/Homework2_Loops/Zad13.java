package Homework2_Loops;
import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число в интервала [2,27]");
		int sum = sc.nextInt();
		for(int i=100; i<=999; i++){
			int x = i%10;
			int y = i/100;
			int z = (i/10)%10;
			if((x+y+z) == sum)
				System.out.print(i + " ");
		}
	}
}
