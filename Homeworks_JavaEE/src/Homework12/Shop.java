package Homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;

public class Shop {
	private String[] types = { "duhov", "strunen", "udaren", "klavishen", "elektronen" };
	private String[] instruments = { "trompet", "trambon", "tuba", "klarinet", "gaida", "kitara", "cigulka", "bandjo",
			"saz", "viola", "sintzator", "basKitara", "elCigulka", "barabani", "tarambuka", "tupan", "dayre", "organ",
			"piano", "akordeon" };
	private static final int NUM_OF_DELIVERED_ITEMS = 5;
	private static final int DEFAULT_QUANTITY = 10;
	private Map<String, Set<Instrument>> items;
	private Map<String, Set<Instrument>> soldItems;
	private double cash;
	private InstrumentSupplier supp;
	
	public Shop() {
		items = new HashMap<String, Set<Instrument>>();
		soldItems = new HashMap<String, Set<Instrument>>();

		for (String type : types) {
			items.put(type, new HashSet<Instrument>());
			soldItems.put(type, new HashSet<Instrument>());
		}

		for (String instr : instruments) {
			Instrument x = Instrument.newInstrument(instr, DEFAULT_QUANTITY);
			items.get(x.getType()).add(x);
			soldItems.get(x.getType()).add(Instrument.newInstrument(instr, 0));
		}
	}



	public Instrument getInstrument(String name) {
		for (Set<Instrument> type : items.values()) {
			for (Instrument instr : type) {
				if (instr.getName().equals(name)) {
					return instr;
				}
			}
		}
		return null;
	}

	public void supplyInstrument(String name, int quantity) {
		supp.supplyInstrument(name,quantity);
	}

	public void sellInstrument(String name, int quantity) {
		if (name != null && Arrays.asList(instruments).contains(name)) {
			Instrument toSell = getInstrument(name);
			if (toSell.getQuantity() >= quantity) {
				cash += toSell.getPrice() * quantity;
				try {
					toSell.decreaseQuantity(quantity);
				} catch (Exception e) {
					e.printStackTrace();
				}

				for (Set<Instrument> type : soldItems.values()) {
					for (Instrument instr : type) {
						if (instr.getName().equals(name)) {
							try {
								instr.increaseQuantity(quantity);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
				System.out.println(quantity + " " + name + "s sold!");
			} else {
				supplyInstrument(name, quantity - toSell.getQuantity());
			}
		} else {
			System.out.println("Error. " + name + " is not a valid instrument name.");
		}
	}
	
	public void deliverMissingItems() {
		for (Set<Instrument> set : items.values()) {
			for (Instrument instr : set) {
				if (instr.getQuantity() <= 0) {
					System.out.println("Supplier delivered 5 " + instr.getName() + "s.");
					instr.setQuantity(NUM_OF_DELIVERED_ITEMS);
				}
			}
		}
	}
	
	private void getItemsBy(String sortBy) {
		if (sortBy != null && !sortBy.isEmpty()) {
			TreeSet<Instrument> sorted = new TreeSet<>();
			if (sortBy.equals("name")) {
				System.out.println("\nORDERED BY NAME: ");
				sorted = new TreeSet<>((o1, o2) -> {
					return o1.getName().compareTo(o2.getName());
				});
			}
			if (sortBy.equals("price ascending")) {
				System.out.println("\nORDERED BY PRICE(ascending): ");
				sorted = new TreeSet<>((o1, o2) -> {
					return (int) (o1.getPrice() - o2.getPrice());
				});
			}
			if (sortBy.equals("price descending")) {
				System.out.println("\nORDERED BY PRICE(descending): ");
				sorted = new TreeSet<>((o1, o2) -> {
					return (int) (o2.getPrice() - o1.getPrice());
				});
			}
			for (Set<Instrument> type : items.values()) {
				for (Instrument instr : type) {
					sorted.add(instr);
				}
			}
			for (Instrument x : sorted) {
				System.out.println(x);
			}
		}
	}

	private void inStock() {
		System.out.println("\nITEMS IN STOCK: ");
		for (Set<Instrument> type : items.values()) {
			for (Instrument instr : type) {
				if (instr.getQuantity() > 0) {
					System.out.println(instr);
				}
			}
		}
	}

	public void catalogue() {
		System.out.println("\nORDERED BY TYPE: "); // не е в азбучен ред, защото
													// не е казано
		for (Set<Instrument> type : items.values()) {
			for (Instrument instr : type) {
				System.out.println(instr);
			}
		}
		getItemsBy("name");
		getItemsBy("price ascending");
		getItemsBy("price descending");
		inStock();
	}

	public double getProfit() {
		System.out.println("PROFIT FROM SALES: ");
		double profit = 0;
		for (Set<Instrument> type : soldItems.values()) {
			for (Instrument instr : type) {
				profit += instr.getPrice() * instr.getQuantity();
			}
		}
		return profit;
	}

	public Collection<Instrument> getSoldItemsSorted() {
		System.out.println("\nINSTRUMENTS SOLD(by quantity sold): ");

		ArrayList<Instrument> sortedByQuantitySold = new ArrayList<Instrument>();
		
		for (Set<Instrument> type : soldItems.values()) {
			for (Instrument instr : type) {
				if (instr.getQuantity() > 0) {
					sortedByQuantitySold.add(instr);
				}
			}
		}
		
		Collections.sort(sortedByQuantitySold, (o1, o2) -> {
			return o2.getQuantity() - o1.getQuantity();
		});
		return sortedByQuantitySold;
	}

	public void soldItemsInfo() {
		ArrayList<Instrument> sorted = (ArrayList<Instrument>) getSoldItemsSorted();
		if (sorted.size() > 0) {
			for (Instrument instr : sorted) {
				System.out.println(instr);
			}
			System.out.println(getProfit());
			System.out.println("MOST BOUGHT INSTRUMENT: ");
			System.out.println(sorted.get(0));
			System.out.println("LEAST BOUGHT INSTRUMENT: ");
			System.out.println(sorted.get(sorted.size() - 1));
		} else {
			System.out.println("NO ITEMS SOLD AT THIS MOMENT!");
		}
	}
	
	public void setSupplier(InstrumentSupplier supp){
		if(supp!=null){
			this.supp=supp;
		}
	}
}
