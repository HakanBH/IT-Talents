package sortingAlgorithms;
import java.util.Arrays;

public class SelectionSort {
	static void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min = arr[i];
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min=arr[j];
					minIndex=j;
				}
			}
			if(i!=minIndex){
				int temp = arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {52,9,6,1,3,6,3,2};
//		int min, minIndex, max, maxIndex,start,end;
//		System.out.println(Arrays.toString(arr));
//		for(int index = 0; index < arr.length/2; index++){
//			start=index;
//			end = arr.length-index-1;
//			min = Integer.MAX_VALUE;
//			max = Integer.MIN_VALUE; 
//			minIndex = 0;
//			maxIndex = 0;
//			
//			for(int i=start;i<=end;i++){
//				if(arr[i] > max){
//					max = arr[i];
//					maxIndex = i;
//				}
//				if(arr[i] < min){
//					min = arr[i];
//					minIndex = i;
//				}
//			}
//			
//			System.out.println("Max: " + max + " Min: " + min);
//
//			int temp2 = arr[start];
//			arr[start] = arr[minIndex];
//			arr[minIndex] = temp2;
//			if(maxIndex == start){
//				maxIndex = minIndex;
//			}
//			System.out.println(Arrays.toString(arr));
//
//			int temp1 = arr[end];
//			arr[end]= arr[maxIndex];
//			arr[maxIndex]=temp1;
//			
//			System.out.println(Arrays.toString(arr));
			selectionSort(arr);
		}
	}

