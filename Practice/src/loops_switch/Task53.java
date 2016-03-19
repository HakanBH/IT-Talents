package loops_switch;
import java.util.Scanner;
//* Task5.3. Write a program that reads a positive number and writes its binary representation.

public class Task53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number(max 1023)");
		int num = sc.nextInt();
		int count,rem,reversed,binary;
		count = rem = reversed = binary = 0;
		while(num%2==0){
			count++;
			num/=2;			
		}
		
		while(num!=0){				//числото в обърнат двоичен вид
			rem = num % 2;
			num /= 2;
			reversed = reversed*10 + rem;
		}
		while(reversed!=0){			//числото в правилен двоичен вид
			rem = reversed%10;
			reversed /= 10;
			binary = binary*10+rem;
		}
		binary *= Math.pow(10, count);
		System.out.println("Binary: " + binary);
	}
}
