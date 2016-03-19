package sortingAlgorithms;
import java.util.Arrays;

public class QuickSort {

	static int partition(int[] a, int l, int r){
		int k = l-1;
		int pivot = a[r];
		for(int index=l; index<=r; index++){
			if(a[index] <= pivot){
				k++;
				int temp = a[index];
				a[index]=a[k];
				a[k]=temp;
			}
		}
		return k;
	}
	static void quickSort(int[] arr, int l , int r){
		if(l>=r){
			return;
		}
		int k = partition(arr,l,r);
		quickSort(arr,l,k-1);
		quickSort(arr,k+1,r);
	}
	
	public static void main(String[] args) {
		int[] arr = {3,6,5132,214,8,3,12,51,3,215};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
