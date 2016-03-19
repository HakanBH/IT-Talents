package Homework2_Loops;
import java.util.Scanner;

public class Zad23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете максимални стойности за множителите ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i=1;
		while(i<=x)
		{
			int j=i;
			while(j<=y){
				System.out.print(i + "*" + j + "=" + (i*j) + "   ");
				j++;
			}
			i++;
			System.out.println("");
		}
	}
}
