package iteratorDemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class Person {
	Integer age = new Integer(0);
	
	Person(int age){
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "" + age;
	}
}

public class IteratorDemo {
	public static void main(String[] args) {
		Person a = new Person(12);
		Person b = new Person(23);
		Person c = new Person(43);
		
		TreeSet<Person> set = new TreeSet<Person>((o1,o2)->{
			return o1.age - o2.age;
		});
		set.add(a);
		set.add(b);
		set.add(c);
		for(Person p : set){
			System.out.println(p);
		}
		
		
		List<String> animals = new LinkedList<String>();
		animals.add("fox");
		animals.add("cow");
		animals.add("dog");
		animals.add("cat");
		
		for(Iterator<String> animal = animals.iterator(); animal.hasNext();){
			System.out.println(animal.next());
		}
	}
}
