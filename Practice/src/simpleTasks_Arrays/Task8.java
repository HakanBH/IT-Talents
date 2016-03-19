package simpleTasks_Arrays;
import java.util.Scanner;

// Напишете програма, която за матрица от булеви стойности, проверява дали се съдържа елемент със стойност true над втория диагонал.

public class Task8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of square matrix: ");
		int size = in.nextInt();
		System.out.println("Enter matrix elements (of boolean type): ");
		boolean[][] matrix = new boolean[size][size];
		for(int row=0; row<size; row++){
			for(int col=0; col<size; col++){
				matrix[row][col] = in.nextBoolean();
			}
		}
		boolean flag = false;
		for(int row = 0; row<size-1; row++){
			for(int col=0; col<size-row-1; col++){
				if(matrix[row][col] == true){
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Matrix has element 'true'.");
		}
		else{
			System.out.println("Metrix doesn't have element 'true'.");
		}
	}

}
