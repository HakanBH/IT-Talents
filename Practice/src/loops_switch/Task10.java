package loops_switch;
import java.util.Scanner;

//* Task10. Write a program that reads a number and prints christmas tree with height of the number. 

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter tree height");
		int height = in.nextInt();
		for(int i=1;i<=height;i++){
			for(int j=i; j<=height; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=height;i++){
			for(int j=1;j<=height;j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
