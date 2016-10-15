public class Candy extends DessertItem {

	double weight;
	int price_per_pound;
	public Candy(String name, double weight, int price_per_pound){
		
		super(name);
		this.weight = weight;
		this.price_per_pound = price_per_pound;
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return weight*price_per_pound;
	}

	
}
