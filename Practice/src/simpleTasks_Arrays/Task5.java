package simpleTasks_Arrays;
import java.util.Scanner;

// Напишете програма, която за дадена матрица m x n от числа намира реда, в който сумата от елементите е максимална.

public class Task5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		System.out.println("Enter matrix elements: ");
		int[][] matrix = new int[rows][columns];
		for(int row=0; row<rows; row++){
			for(int col=0; col<columns; col++){
				matrix[row][col] = in.nextInt();
			}
		}
		int sumRow = 0;
		int maxSumRow = 0;
		int maxSumRowIndex = 0;
		for(int row = 0; row < rows; row++){
			for(int col = 0; col < columns; col++){
				sumRow += matrix[row][col];
			}
			if(sumRow > maxSumRow){
				maxSumRow = sumRow;
				maxSumRowIndex = row+1;
			}
			sumRow=0;
		}
		System.out.println("Row " + maxSumRowIndex + " has the largest sum : " + maxSumRow );
	}
}
