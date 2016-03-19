package Homework3_Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size (must be even number):");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = in.nextInt();
		}
		int[] newArr = new int[size];
		for(int i=0; i<size; i++){
			if(i<size/2){
				newArr[i]=array[i];
			}
			else{
				newArr[i]=array[size-i-1];
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(newArr[i] + " ");
		}
	}
}
