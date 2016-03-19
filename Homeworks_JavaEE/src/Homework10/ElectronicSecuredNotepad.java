package Homework10;

public class ElectronicSecuredNotepad extends SecuredNotepad
			implements IElectronicDevice, ISecuredNotepad{
	private boolean started;
	
	public ElectronicSecuredNotepad(String password) {
		super(password);
	}
	
	@Override
	public void start() {
		started = true;	
	}

	@Override
	public void stop() {
		started=false;
	}

	@Override
	public boolean isStarted() {
		return started;
	}
	
	@Override
	public void addTextToPage(String text, int page) {
		if(isStarted()){
			super.addTextToPage(text, page);
		}
	}
	
	@Override
	public void overwritePage(String text, int page) {
		if(isStarted()){
			super.overwritePage(text, page);
		}
	}

	@Override
	public void deletePage(int page) {
		if(isStarted()){
			super.deletePage(page);
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(isStarted()){
			return super.searchWord(word);
		}
		else{
			System.out.println("Device must be turned on!");
			return false;
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if(isStarted()){
			super.printAllPagesWithDigits();
		}
	}
}
