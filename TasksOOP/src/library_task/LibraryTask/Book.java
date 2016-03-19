package LibraryTask;
import java.time.LocalDate;
import java.util.Comparator;

public class Book extends Read {
	private static final int BOOK_RETURN_TIME = 300;
	private static final double BOOK_TAX = 2;
	private String author;

	public Book(String name, String publisher, LocalDate publishDate, String author, String genre) {
		super(name, publisher, publishDate,genre);
		setAuthor(author);
	}

	@Override
	public Comparator getComparator() {
		return new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o2.getPublishDate().compareTo(o1.getPublishDate());
			}
		};
	}
	
	@Override
	public int getMaxSeconds() {
		return BOOK_RETURN_TIME;
	}
	
	@Override
	public String getType() {
		return "Book";
	}

	public double getTax() {
		return BOOK_TAX;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Author: " + this.getAuthor() + ", Publisher: " + this.getPublisher();
	}
}
