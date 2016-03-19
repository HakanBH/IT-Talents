package simpleTasks_Arrays;
import java.util.Scanner;

// Ќапишете програма, ко€то за дадена матрица от символи отпечатва на екрана елементите, които се намират на главни€ диагонал.

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of square matrix: ");
		int size = in.nextInt();
		System.out.println("Enter matrix elements: ");
		int[][] matrix = new int[size][size];
		for(int row=0; row<size; row++){
			for(int col=0; col<size; col++){
				matrix[row][col] = in.nextInt();
			}
		}
		for(int index=0 ;index<size; index++){
			System.out.print(matrix[index][index] + " ");
		}
	}

}
