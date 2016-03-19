package arrays;
import java.util.Scanner;

// ѕо даден квадратен двумерен масив от естествени числа, да се отпечатат диагоналите на масива.

public class Zad6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix size");
		int n = in.nextInt();
		System.out.println("Enter matrix elements");
		int matrix[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j =0 ;j<n;j++){
				matrix[i][j] = in.nextInt();
			}
		}
		System.out.print("Main diagonal: ");
		for(int i=0;i<n;i++){
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println("");
		System.out.print("Secondary diagonal: ");
		for(int i=0;i<n;i++){
			System.out.print(matrix[i][n-1-i] + " ");
		}
	}

}
