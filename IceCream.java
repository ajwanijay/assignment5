
public class IceCream extends DessertItem {

	double cost;
	public IceCream(String name, double cost){
		super(name);
		this.cost = cost;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	
}

