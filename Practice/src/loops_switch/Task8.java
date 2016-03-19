package loops_switch;
import java.util.Scanner;

//* Task8. Write a program that reads a number and prints a triangle of stars with the height of  the number.

public class Task8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter triangle height");
		int height = in.nextInt();
		for(int i = 1; i<=height;i++){
			for(int j=i; j<=height; j++){			// цикъл за интервалите 
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1;j++){				// цикъл за звездите
				System.out.print("*");
			}
			System.out.println("");					// преминаване на нов ред
		}	
	}

}
