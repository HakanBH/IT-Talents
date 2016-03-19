package shop_class;

public interface IBuyer {
	public void addByWeight(ProductByWeight item, double weight);
	public void removeByWeight(ProductByWeight item, double weight);
	public void addByNumber(ProductByNumber item, int number);
	public void removeByNumber(ProductByNumber item, int number);
}
