package LibraryTask;
import java.time.LocalDate;
import java.util.Comparator;

public class Magazine extends Read{
	private String category;
	private int issue;
	
	public Magazine(String name, String publisher, LocalDate publishDate, String category, int issue) {
		super(name, publisher, publishDate, category);
		setIssue(issue);
	}

	@Override
	public Comparator getComparator() {
		return new Comparator<Magazine>() {
			@Override
			public int compare(Magazine o1, Magazine o2) {
				if(o1.getName().equals(o2.getName())){
					return o1.getIssue() - o2.getIssue();
				}
				return o1.getName().compareTo(o2.getName());
			}
		};
	}
	
	@Override
	public String getType() {
		return "Magazine";
	}
	
	@Override
	public int getMaxSeconds() throws Exception {
		throw new Exception("Magazines can't be taken out of library");
	}
	
	@Override
	public double getTax() throws Exception {
		throw new Exception("Magazines can only be read in library!!!");
	}

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}	
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Issue: " + getIssue() + ", Publisher " + getPublisher();
	}
}
