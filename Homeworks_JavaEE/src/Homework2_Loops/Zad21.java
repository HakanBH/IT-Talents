package Homework2_Loops;
import java.util.Scanner;

public class Zad21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете номер на картата");
		int num = sc.nextInt();
	
		for(int i = num; i<=52; i++)
		{	
			if(i>=1 && i<=4)
				System.out.print("Двойка ");
			if(i>=5 && i<=8)
				System.out.print("Тройка ");
			if(i>=9 && i<=12)
				System.out.print("Четворка ");
			if(i>=13 && i<=16)
				System.out.print("Петица ");
			if(i>=17 && i<=20)
				System.out.print("Шестица ");
			if(i>=21 && i<=24)
				System.out.print("Седмица ");
			if(i>=25 && i<=28)
				System.out.print("Осмица");
			if(i>=29 && i<=32)
				System.out.print("Девятка");
			if(i>=33 && i<=36)
				System.out.print("Десятка ");
			if(i>=37 && i<=40)
				System.out.print("Вале ");
			if(i>=41 && i<=44)
				System.out.print("Дама ");
			if(i>=45 && i<=48)
				System.out.print("Поп ");
			if(i>=49 && i<=52)
				System.out.print("Асо ");
			
			int rem=i%4;
			switch(rem){
			case 1:
				System.out.println("спатия");
				break;
			case 2:
				System.out.println("каро");
				break;
			case 3:
				System.out.println("купа");
				break;
			case 0:
				System.out.println("пика");
				break;
			}
		}
	}
}
