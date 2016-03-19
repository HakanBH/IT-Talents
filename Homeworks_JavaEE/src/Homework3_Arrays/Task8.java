package Homework3_Arrays;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = in.nextInt();
		}
		int count=1;
		int maxCount=1;
		for(int i=0;i<size-1;i++){
			if(array[i] == array[i+1]){
				count++;
				if(count > maxCount){
					maxCount = count;
				}
			}
			else{
				count = 1;
			}
		}
		System.out.println("Longest sequence of equal numbers: " + maxCount);
	}
}
