package sortingAlgorithms;
import java.util.Arrays;

public class Demo {
	
	static void bubbleSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			boolean flag=false;
			for(int j=0; j<arr.length-i;j++){
				if(arr[j]>arr[j+1]){
					flag = true;
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			if(flag=false){
				return;
			}
		}
	}
	static void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i){
				int temp = arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	static void countingSort(int[] arr){
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		int range = max - min;
		System.out.println(range);
		int[] count = new int[range+1];
		
		for(int i=0;i<arr.length;i++){
			count[arr[i]-min]++;
		}
		System.out.println(Arrays.toString(count));
		int index=0;
		for(int i=0;i<count.length;i++){
			while(count[i]>0){
				System.out.print(i + min + " ");
				count[i]--;
			}
		}
		System.out.println("");
	}
	static int partition(int[] arr, int l ,int r){
		int pivot = arr[r];
		int k = l-1;
		for(int i=l ; i <= r;i++){
			if(arr[i]<=pivot){
				k++;
				int temp = arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
		}
		return k;
	}
	static void quickSort(int[] arr, int l, int r){
		if(l>=r){
			return;
		}
		int k = partition(arr,l,r);
		quickSort(arr,l,k-1);
		quickSort(arr,k+1,r);
	}
	public static void main(String[] args) {
		int[] arr={100,123,74,-15,-20,75,67,94};
		//bubbleSort(arr);
		//selectionSort(arr);
		countingSort(arr);
		//quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
