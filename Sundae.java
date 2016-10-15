public class Sundae extends IceCream {

	
	private String topping;
	private double topping_price;

	public Sundae(String name, double price, String topping, double topping_price){
		super(name, price);
		this.topping = topping;
		this.topping_price = topping_price;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+topping_price;
	}

	

	
}
