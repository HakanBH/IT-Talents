package arrays;
import java.util.Scanner;

// ƒаден е масив с 20 елемента, цели числа. ƒа се изведе най-гол€мото число в масива.
public class Zad3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = in.nextInt();
		int arr[] = new int[size];
		int max = Integer.MIN_VALUE;
		System.out.println("Enter values for array elements");
		for(int i=0; i<size;i++){
			arr[i] = in.nextInt();
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Largest element in array is: " + max);		
	}
}
