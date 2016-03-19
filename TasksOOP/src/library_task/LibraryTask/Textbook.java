package LibraryTask;
import java.time.LocalDate;
import java.util.Comparator;

public class Textbook extends Read{
	private static final int TEXTBOOK_RETURN_TIME = 150;
	private static final double TEXTBOOK_TAX = 3;
	private String subject;
	private String author;
	
	public Textbook(String name, String publisher, LocalDate publishDate, String author, String subject) {
		super(name, publisher, publishDate, subject);
		setAuthor(author);
	}
	
	@Override
	public Comparator getComparator() {
		return new Comparator<Textbook>() {
			@Override
			public int compare(Textbook o1, Textbook o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
	}
	
	
	@Override
	public String getType() {
		return "Textbook";
	}
	
	@Override
	public int getMaxSeconds() {
		return TEXTBOOK_RETURN_TIME;
	}

	@Override
	public double getTax() {
		return TEXTBOOK_TAX;
	}
	
	public void setAuthor(String author){
		if(author!=null && !author.isEmpty()){
			this.author = author;
		}
	}
	
	public String getAuthor(){
		return author;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Author: " + this.getAuthor() + ", Publisher: " + getPublisher();
	}
}
