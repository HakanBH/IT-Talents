package simpleTasks_Arrays;
import java.util.Scanner;

// Напишете програма, която за дадена матрица намира произведението на елементите под главния диагонал.

public class Task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter square matrix size: ");
		int size = in.nextInt();
		System.out.println("Enter matrix elements: ");
		int[][] matrix = new int[size][size];
		for(int row = 0; row<size; row++){
			for(int col = 0; col<size; col++){
				matrix[row][col] = in.nextInt();
			}
		}
		int prod = 1;
		for(int row = 0; row < size; row++){
			for(int col=0; col < row; col++){
				prod *= matrix[row][col];
			}
		}
		System.out.println("Production of elements below the main diagonal is " + prod);
	}
}
