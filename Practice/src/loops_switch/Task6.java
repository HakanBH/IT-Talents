package loops_switch;
import java.util.Scanner;

//* Task6. Write a program that reads a short positive number and tells how many bits are 1 in it.

public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a short positive number");
		short num = in.nextShort();
		int rem = 0;
		int binary = 0;
		int count = 0;
		while(num!=0){
			if(num%2==1){
				count++;
			}
			num=(short)(num/2);
		}
		System.out.println("The number has "+ count + " 1's in binary");
	}
}
