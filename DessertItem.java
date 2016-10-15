public abstract class DessertItem {

	String name;
	Float cost;

	public double getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public DessertItem() {

	}

	public DessertItem(String name) {
		this.name = name;
	}

}