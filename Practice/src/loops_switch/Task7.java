package loops_switch;
import java.util.Scanner;
//* Task7. Write a program that reads numbers A, B and C. A must be short. B and C must be < 7.
// The program has to invert the bits from number A on positions B and C. Print the new value of A.

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a short positive number");
		short num = in.nextShort();
		System.out.println("Enter bits to invert (<7)");
		byte x = in.nextByte();
		byte y = in.nextByte();
		num ^= (1 << x);			// invert bit x
		num ^= (1 << y);			// invert bit y
		System.out.println(num);
	}
}
