package Homework3_Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = in.nextInt();
		}
		int min = array[0];
		for(int i=0;i<size;i++){
			if(array[i] < min && array[i]%3 == 0){
				min = array[i];
			}
		}
		System.out.println(min);
	}
}
