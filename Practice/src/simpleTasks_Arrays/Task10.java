package simpleTasks_Arrays;
import java.util.Scanner;

// Напишете програма, която намира най-често срещания елемент в масив. Пример: {4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3} => 4 (5 times).

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];
		for(int index=0;index<size;index++){
			arr[index] = in.nextInt();
		}
		int mostCommon = 0;
		int count = 0;
		int maxCount = 0;
		for(int i=0;i<size-1;i++){
			for(int j=0; j<size; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count > maxCount){
				maxCount = count;
				mostCommon = arr[i];
			}
			count = 0;
		}
		System.out.println("Most common element is " + mostCommon + " (" + maxCount + " times)");
	}
}
