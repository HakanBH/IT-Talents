package RestourantTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Waiter extends Person {
	private List<Table> tables;

	boolean isQkoParche;

	public Waiter(String name, Double money) {
		super(name, money);
		tables = new ArrayList<Table>();
		for (int i = 0; i < 5; i++) {
			tables.add(new Table());
		}
	}

	public boolean hasFreeTables() {
		synchronized (tables) {
			for (Table t : tables) {
				if (!t.isOccupied()) {
					return true;
				}
			}
		}
		return false;
	}

	public Table giveTableToClient() throws Exception {
		synchronized (tables) {
			for (Table t : tables) {
				if (!t.isOccupied()) {
					return t;
				}
			}
		}
		throw new Exception("No free tables at the moment.");
	}

	public List<Table> getAssignedTables() {
		return Collections.unmodifiableList(tables);
	}

	public void setIsQkoParche(boolean b) {
		this.isQkoParche = b;
	}

	public boolean isQkoParche() {
		return isQkoParche;
	}
}
