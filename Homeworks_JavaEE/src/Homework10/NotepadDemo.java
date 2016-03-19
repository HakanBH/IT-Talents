package Homework10;

import java.util.Scanner;

public class NotepadDemo {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter password for your notepad(must contain at least"
				+ "\n5 letters, upper case, lower case and a digit!");
		String password = in.next();
		ElectronicSecuredNotepad elNotepad = new ElectronicSecuredNotepad(password);
		while(!SecuredNotepad.isStrong(password)){
			password = in.next();
			elNotepad=new ElectronicSecuredNotepad(password);
		}
		
		elNotepad.start();
		
//индексирането на страниците започва от 1
		elNotepad.addTextToPage("This won't be added because 0 is not a valid page", 0);
		
		elNotepad.addTextToPage("Dear diary, blablabla" , 1);
		elNotepad.addTextToPage("Adding some more text to page 1" , 1);
		elNotepad.addTextToPage("This page will be deleted.", 2);
		elNotepad.addTextToPage("Page with numbers. The date is 8.1.2016", 3);
		elNotepad.addTextToPage("Some random text on the second page..." , 10);
		elNotepad.overwritePage("Remove old content and add new text to page." , 10);
		elNotepad.deletePage(2);			
		elNotepad.printAllPagesWithDigits();
		System.out.println(elNotepad.searchWord("blablabla"));
		System.out.println(elNotepad);
	}

}
