package Homework10;

public interface INotepad {
	static final int MAX_PAGES = 100;
	
	void addTextToPage(String text, int page);
	void overwritePage(String text, int page);
	void deletePage(int page);
	boolean searchWord(String word);
	void printAllPagesWithDigits();
	String toString();
	
	default boolean pageExists(int page){
		if(page>=0 && page<MAX_PAGES){
			return true;
		}
		else{
			System.out.println("Invalid page number!");
			return false;
		}
	}
}
