package LibraryTask;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Read {
	private String name;
	private String publisher;
	private LocalDate publishDate;
	private String category;
	private boolean isTaken;
	
	List<ReadHistory> history;

	public Read(String name,String publisher, LocalDate publishDate, String category){
		setName(name);
		setPublisher(publisher);
		setPublishDate(publishDate);
		setCategory(category);
		this.history = new ArrayList<ReadHistory>();
	}
	
	public abstract Comparator getComparator();
	public abstract String getType();
	public abstract double getTax() throws Exception;
	public abstract int getMaxSeconds() throws Exception;
	
	public String getCategory(){
		return category;
	}
	
	public void setCategory(String category){
		if(category!=null && !category.isEmpty()){
			this.category = category;
		}
	}
	
	public boolean isTaken(){
		return isTaken;
	}
	
	public String getName() {
		return name;
	}
	public String getPublisher() {
		return publisher;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}	
	
	public LocalDateTime getTimeTaken(){
		return history.get(history.size()-1).getTakenTime();
	}
	
	public void setTaken(){
		if(isTaken == false){
			isTaken = true;
			history.add(new ReadHistory(LocalDateTime.now()));
		}
		else{
			isTaken = false;
			history.get(history.size()-1).setReturnedTime(LocalDateTime.now());
		}
	}
}
