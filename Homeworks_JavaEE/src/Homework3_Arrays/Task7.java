package Homework3_Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = in.nextInt();
		}
		int[] newArr = new int[size];
		newArr[0] = array[1];						
		newArr[size-1] = array[size-2];				
		for(int i=1;i<size-1;i++){				
			newArr[i] = array[i-1] + array[i+1];
		}
		for(int i=0;i<size;i++){
			System.out.print(newArr[i] + " ");
		}
	}

}
