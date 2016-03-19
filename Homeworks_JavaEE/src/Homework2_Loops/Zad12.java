package Homework2_Loops;
public class Zad12 {
	public static void main(String[] args) {
		for(int i=102; i<=987;i++){
			int x = i%10;
			int y = i/100;
			int z = (i/10)%10;
			if( (x != y) && (x != z) && (y != z) )
				System.out.println(i);
		}	
	}
}
