package loops_switch;
import java.util.Scanner;

//*Task.5.2. Write a program that by given number, constructs another number with the digits of the given,
// but in reverse order. Example: A = 5241. Output: B=1425 

public class Task52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int reversed = 0;
		int remainder = 0;
		while(num!=0){
			remainder = num%10;
			reversed = reversed*10 + remainder;
			num/=10;
		}
		System.out.println("Reversed: " + reversed);
	}
}
