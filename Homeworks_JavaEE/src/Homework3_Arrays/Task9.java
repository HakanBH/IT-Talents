package Homework3_Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = in.nextInt();
		}
		
//		С един допълнителен масив:
//		int[] reversedArr = new int[size];
//		for(int i=0;i<size;i++){
//			reversedArr[i] = array[size-1-i];
//		}

//		Без допълнителен масив:
		int temp;
		for(int i=0;i<size/2; i++){
			temp = arr[size-i-1];
			arr[size-i-1] = arr[i];
			arr[i] = temp;
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
