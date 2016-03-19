package PostOffice;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
	private List<Letter> letters;

	public Mailbox(){
		letters = new ArrayList<Letter>();
	}
	
	public void addLetter(Letter letter){
		if(letter != null){
			synchronized(letters){
				letters.add(letter);					
			}
		}
	}
		
	public List<MailObject> takeAllLetters(){
		synchronized(letters){
			List<MailObject> takenLetters = new ArrayList<MailObject>(letters);
			letters.clear();
			return takenLetters;
		}
	}
}
