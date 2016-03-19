package Homework3_Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = in.nextInt();
		}
		boolean isMirror = true;
		for(int i=0; i<size/2; i++){
			if(array[i] != array[size-i-1]){
				isMirror=false;
				break;
			}
		}
		System.out.println(isMirror);
	}
}
