package simpleTasks_Arrays;
import java.util.Scanner;

// Напишете програма, която проверява дали в масив от цели числа всички числа са неотрицателни.

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];
		for(int index = 0; index<size; index++){
			arr[index] = in.nextInt();
		}
		boolean nonNegative = true;
		for(int index=0; index<size;index++){
			if(arr[index]<0){
				nonNegative = false;
				break;
			}
		}
		if(nonNegative){
			System.out.println("All elements are >= 0.");
		}
		else{
			System.out.println("The array has negative numbers.");
		}
	}
}
