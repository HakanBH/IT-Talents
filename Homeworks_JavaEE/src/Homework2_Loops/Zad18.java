package Homework2_Loops;
import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете максимални стойности за множителите ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i=1;i<=x;i++){
			for(int j=1;j<=y;j++){
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
}
