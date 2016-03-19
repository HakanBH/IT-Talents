package Homework2_Loops;
import java.util.Scanner;

public class Zad19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число от интервала [10,99]");
		int x = sc.nextInt();
		while(x != 1){
			if(x%2==0){
				x/=2;
			}
			else{
				x = 3*x+1;
			}
			System.out.print(x + " ");
		}
	}
}
