package simpleTasks_Arrays;
import java.util.Scanner;

// Да се напише програма която изисква от потребителя да въведе 2 числа n и m.
// След това да се построи матрица с размер n x m по  следният начин (примерите са дадени за въведени n=4 и m=5):
//	1 2 3 4 5			1 5 9 13 17		1 3 6 10 14		1 8 9 16 17
//	6 7 8 9 10			2 6 10 14 18	2 5 9 13 17		2 7 10 15 18
//	11 12 13 14 15		3 7 11 15 19	4 8 12 16 19	3 6 11 14 19
//	16 17 18 19 20		4 8 12 16 20	7 11 15 18 20	4 5 12 13 20
public class Task11 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int rows = in.nextInt();
		int cols = in.nextInt();
		int[][] matrix = new int[rows][cols];
		int n = 1;
// matrix 1
//		for(int row=0; row<rows; row++){
//			for(int col=0; col<cols; col++){
//				matrix[row][col] = n++;
//			}
//		}
// matrix 2
//		for(int col = 0; col<cols; col++){
//			for(int row = 0; row<rows; row++){
//				matrix[row][col] = n++;
//			}
//		}
// matrix 3
//		int r=0; int c=0;
//		for(int row=0; row<rows; row++){
//			r = row;
//			c = 0;
//			while(c<cols && r>=0){
//				matrix[r][c] = n++;
//				c++;
//				r--;
//			}
//		}
//		for(int col=1;col<cols;col++){
//			r=rows-1;
//			c=col;
//			while(c<cols && r>=0){
//				matrix[r][c] = n++;
//				c++;
//				r--;
//			}
//		}
// matrix 4
		int r = 0;
		for(int c=0; c<cols; c++){
			if(r == 0){
				while(r < rows){
					matrix[r][c] = n++;
					r++;
				}
				r = rows-1;
				continue;
			}
			if(r == rows-1){
				while(r >= 0){
					matrix[r][c] = n++;
					r--;
				}
				r = 0;
				continue;
			}
		}
		for(int row=0; row<rows; row++){
			for(int col=0; col<cols; col++){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println("");
		}
	}
}
