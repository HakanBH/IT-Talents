package Homework2_Loops;
import java.util.Scanner;

public class Zad21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� �� �������");
		int num = sc.nextInt();
	
		for(int i = num; i<=52; i++)
		{	
			if(i>=1 && i<=4)
				System.out.print("������ ");
			if(i>=5 && i<=8)
				System.out.print("������ ");
			if(i>=9 && i<=12)
				System.out.print("�������� ");
			if(i>=13 && i<=16)
				System.out.print("������ ");
			if(i>=17 && i<=20)
				System.out.print("������� ");
			if(i>=21 && i<=24)
				System.out.print("������� ");
			if(i>=25 && i<=28)
				System.out.print("������");
			if(i>=29 && i<=32)
				System.out.print("�������");
			if(i>=33 && i<=36)
				System.out.print("������� ");
			if(i>=37 && i<=40)
				System.out.print("���� ");
			if(i>=41 && i<=44)
				System.out.print("���� ");
			if(i>=45 && i<=48)
				System.out.print("��� ");
			if(i>=49 && i<=52)
				System.out.print("��� ");
			
			int rem=i%4;
			switch(rem){
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 0:
				System.out.println("����");
				break;
			}
		}
	}
}
