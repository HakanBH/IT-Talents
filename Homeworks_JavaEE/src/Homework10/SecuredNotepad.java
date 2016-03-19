package Homework10;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad{
	private String password;
	Scanner in = new Scanner(System.in);
	
	//в случая пак се създава обект, но не може да се ползва т.к. паролата е null
	//не се сетих за по-добър вариант
	public SecuredNotepad(String password) {
		if(isStrong(password)){
			this.password = password;
			System.out.println("Notebook created!");
		}
		else{
			System.out.println("Invalid password. Enter new one: ");
		}
	}
	
	@Override
	public boolean demandPassword(){
		System.out.println("Enter password to edit notebook: ");
		String pass = in.next();
		if(pass.equals(password)){
			return true;
		}
		return false;
	}
	
	@Override
	public void addTextToPage(String text, int page){
		if(demandPassword()){
			super.addTextToPage(text, page);
		}
		else{
			System.out.println("Incorrect password!");
		}
	}
	
	@Override
	public void overwritePage(String text, int page){
		if(demandPassword()){
			super.overwritePage(text, page);
		}
		else{
			System.out.println("Incorrect password!");
		}
	}
	
	@Override
	public void deletePage(int page) {
		if(demandPassword()){
			super.deletePage(page);
		}
		else{
			System.out.println("Incorrect password!");
		}
	}
	
	@Override
	public boolean searchWord(String word) {
		if(demandPassword()){
			return super.searchWord(word);
		}
		else{
			System.out.println("Incorrect password!");
			return false;
		}
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(demandPassword()){
			super.printAllPagesWithDigits();
		}
		else{
			System.out.println("Incorrect password!");
		}
	}
	
	static boolean isStrong(String password){
		if(password!=null && password.length()>=5){
			boolean hasUpperCase=false;
			boolean hasLowerCase=false;
			boolean hasDigit=false;
			
			for(int index=0; index<password.length(); index++){
				if(password.charAt(index)>='0' && password.charAt(index)<='9'){
					hasDigit = true;
					continue;
				}
				if(password.charAt(index)>='a' && password.charAt(index)<='z'){
					hasLowerCase=true;
					continue;
				}
				if(password.charAt(index)>='A' && password.charAt(index)<='Z'){
					hasUpperCase=true;
				}
			}
			if(hasDigit && hasUpperCase && hasLowerCase){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		if(demandPassword()){
			return super.toString();
		}
		else{
			return "Incorrect password!";
		}
	}
	

}
