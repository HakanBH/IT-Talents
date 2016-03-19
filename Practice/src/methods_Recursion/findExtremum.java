package methods_Recursion;
import java.util.Arrays;

public class findExtremum {
	static void findExtremum(int[] a){
		System.out.println(Arrays.toString(a));
		int i=0;
		while(i<a.length-1 && a[i]==a[i+1]){
			i++;
		}
		if(i==a.length-1){
			System.out.println("All elements are equal.");
		}
		if(a[i]<a[i+1]){
			boolean flag = true;
			int max = a[0];
			int maxIndex = 0;
			for(int index=i;index<a.length;index++){
				if(a[index]>max){
					max=a[index];
					maxIndex=index;
				}
			}
			for(int index = i; index < maxIndex; index++){
				if(a[index]>a[index+1]){
					flag = false;
					break;
				}
			}
			for(int index = maxIndex; index<a.length-1; index++){
				if(a[index]<a[index+1]){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println("Extremum: " + max);
				System.out.println("Extremum index: " + maxIndex);
			}
		}
		else{
			boolean flag = true;
			int min = a[0];
			int minIndex = 0;
			for(int index = i ; index < a.length; index++){
				if(a[index]<min){
					min = a[index];
					minIndex=index;
				}
			}
			for(int index = i; index<minIndex; index++){
				if(a[index]<a[index+1]){
					flag = false;
					break;
				}
			}
			for(int index = minIndex; index < a.length-1; index++){
				if(a[index]>a[index+1]){
					flag=false;
					break;
				}
			}	
			if(flag){
				System.out.println("Extremum: " + min);
				System.out.println("Extremum index: " + minIndex);
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {1,6,2,1};
		int[] b= {1,2,3,4};
		int[] c={1,2,3,6,5,3};
		int[] d={12,8,5,3,6,8};
		findExtremum(a);
		findExtremum(b);
		findExtremum(c);
		findExtremum(d);
	}
}
