package sortingAlgorithms;
import java.util.Arrays;

public class CountingSort {
	static int[] countingSort(int[] arr){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int[] counts = new int[max+1];
		for(int i=0;i<arr.length;i++){
			counts[arr[i]]++;
		}
		int[] result = new int[arr.length];
		int index = 0;
		for(int i=0;i<counts.length;i++){
			while(counts[i]>0){
				result[index] = i;
				counts[i]--;
				index++;
			} 
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {10,63,2,3,7,23,1,2,3,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(countingSort(arr)));
	}
}
