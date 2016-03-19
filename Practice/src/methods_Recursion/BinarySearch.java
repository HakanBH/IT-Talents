package methods_Recursion;
import java.util.Arrays;

public class BinarySearch {
	static int binarySearch(int num, int[] arr, int l, int r) {
		int m = (l + r) / 2;
		if (r < l) {
			return -1;
		}

		if (num == arr[m]) {
			return m;
		} 
		else {
			if (num < arr[m]) {
				return binarySearch(num, arr, l, m - 1);
			}
			else{
				return binarySearch(num, arr, m + 1, r);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 10, 15, 50, 100, 150, 200, 500 };
		int num = 500;
		System.out.println("Index of elem " + num + ": " + binarySearch(num, arr, 0, arr.length - 1));
	}
}
