package Homework3_Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array elements (7 numbers): ");
		int[] arr = new int[7];
		for(int i=0;i<arr.length;i++){
			arr[i] = in.nextInt();
		}
		// swap with exra variable
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		// swap with sum
		arr[2] = arr[3] + arr[2];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		
		// swap with multiplication
		arr[4] = arr[4]*arr[5];
		arr[5] = arr[4]/arr[5];
		arr[4] = arr[4]/arr[5];		

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

}
