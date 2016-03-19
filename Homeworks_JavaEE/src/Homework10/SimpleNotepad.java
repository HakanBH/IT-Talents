package Homework10;


public class SimpleNotepad implements INotepad {
	private Page[] pages;
	
	SimpleNotepad(){
		pages = new Page[INotepad.MAX_PAGES];
	}
	
	@Override
	public void addTextToPage(String text, int page) {
		if(pageExists(page-1)){
			if(pages[page-1]==null){
				pages[page-1]=new Page();
			}
			pages[page-1].addText(text);
			System.out.println("Text added to page " + page);
		}
	}
	
	@Override
	public void overwritePage(String text, int page) {
		if(pageExists(page-1) && pages[page-1]!=null){
			pages[page-1].deleteText();
			pages[page-1].addText(text);
			System.out.println("Text on page " + page + " overwritten");
		}
	}

	@Override
	public void deletePage(int page) {
		if(pageExists(page-1) && pages[page-1]!=null){
			pages[page-1].deleteText();
			System.out.println("Page " + page + " deleted!");
		}
	}
	
	@Override
	public boolean searchWord(String word) {
		for(int page=0; page<MAX_PAGES; page++){
			if(pages[page]!=null && pages[page].searchWord(word)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		for(int page=0; page<MAX_PAGES; page++){
			if(pages[page]!=null && pages[page].containsDigit()){
				System.out.println(pages[page]);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		for(int page=0; page<MAX_PAGES; page++){
			if(pages[page]!=null && !pages[page].isEmpty()){			
				res.append((page+1) + "\t" + pages[page] + "\n");
			}
		}
		return res.toString();
	}
}
