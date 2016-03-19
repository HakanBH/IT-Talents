package loops_switch;
import java.util.Scanner;

public class Task9 {
//* Task9. Modify task 8 to print a triangle that is hollow and has only a frame of stars.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter triangle height");
		int height = in.nextInt();
		for(int i=1;i<=height;i++){
			for(int j=i; j<=height; j++){
				System.out.print(" ");
			}
			if(i == height){
				for(int j=1;j<height*2;j++){
					System.out.print("*");
				}
				break;
			}
			if(i>1){
				System.out.print("*");
			}
			for(int j=i*2-3 ; j>=1; j--){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
	}

}
