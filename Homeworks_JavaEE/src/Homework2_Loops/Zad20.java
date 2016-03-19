package Homework2_Loops;

public class Zad20 {

	public static void main(String[] args) {
		for(int i=0;i<=9;i++){
			for(int j=i, k=0; k<=9 ; k++){
				if(j==9){
					j=0;
				}
				else{
					j++;
				}
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
