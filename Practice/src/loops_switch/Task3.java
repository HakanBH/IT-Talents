package loops_switch;
import java.util.Scanner;

// * Task3. Write a program that prints all numbers from A to B that can be divided by 3. A and B - from console.
// Numbers must be in ascending order.

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b >= a){
			for(int i=a;i<=b;i++){
				if(i%3==0){
					System.out.print(i + " ");
				}
			}
		}
		else {
			for(int i=b;i<=a;i++){
				if(i%3==0){
					System.out.print(i + " ");
				}
			}
		}
	}

}
