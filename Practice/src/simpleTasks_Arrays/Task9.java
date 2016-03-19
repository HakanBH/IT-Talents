package simpleTasks_Arrays;
import java.util.Scanner;

// Дадена е правоъгълна матрица с числа. Да се намери в нея максималната подматрица с размер 2 х 2 и да се отпечата на конзолата.
// Под максимална подматрица се разбира подматрица, която има максимална сума на елементите, които я съставят.

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int rows = in.nextInt();
		int cols = in.nextInt();
		System.out.println("Enter matrix elements: ");
		int matrix[][] = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		int sumSquare = 0;
		int maxSum = 0;
		int[][] submatrix = new int[2][2];
		for(int row = 1; row<rows; row++){
			for(int col = 1; col<cols; col++){
				sumSquare = matrix[row][col] + matrix[row-1][col-1] + matrix[row-1][col] + matrix[row][col-1];
				if(sumSquare > maxSum){
					maxSum=sumSquare;
					submatrix[0][0] = matrix[row-1][col-1];
					submatrix[0][1] = matrix[row-1][col];
					submatrix[1][0] = matrix[row][col-1];
					submatrix[1][1] = matrix[row][col];
				}
			}
			sumSquare = 0;
		}
		System.out.println("Max 2x2 submatrix sum is " + maxSum);
		System.out.println("The submatrix is: ");
		System.out.println(submatrix[0][0] + " " + submatrix[0][1]);
		System.out.println(submatrix[1][0] + " " + submatrix[1][1]);
	}

}
