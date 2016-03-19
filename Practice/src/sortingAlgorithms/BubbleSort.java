package sortingAlgorithms;
import java.sql.Date;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args){
		int[] arr = {52,9,20,20,1,3,6,3,2,123};
		for(int i=1; i<arr.length;i++){
			boolean flag = false;
			for(int j=0; j<arr.length - i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					flag = true;
				}
			}
			if(flag==false){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
