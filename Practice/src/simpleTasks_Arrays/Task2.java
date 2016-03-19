package simpleTasks_Arrays;
import java.util.Scanner;

//Едномерен масив наричаме назъбен, ако всеки елемент в масива е > от предишния и < от следващия. 
//Напишете програма, която проверява дали даден масив от числа е назъбен.

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];
		for(int index = 0; index<size; index++){
			arr[index] = in.nextInt();
		}
		boolean isZigZag = true;
		for(int index = 1; index<size-1; index++){
			if(	!((arr[index]>arr[index-1] && arr[index]>arr[index+1]) || 
					(arr[index]<arr[index-1] && arr[index]<arr[index+1]))){
				isZigZag = false;
				break;
			}
		}
		if(isZigZag){
			System.out.println("The array is zig-zag.");
		}
		else{
			System.out.println("The array is not zig-zag.");
		}
	}
}
