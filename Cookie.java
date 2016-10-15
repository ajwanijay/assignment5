
public class Cookie extends DessertItem {

	int no_of_cookies;
	int price_of_dz;
	public Cookie(String name, int no_of_cookies, int price_of_dz){
		
		super(name);
		this.no_of_cookies = no_of_cookies;
		this.price_of_dz = price_of_dz;
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return price_of_dz/12*no_of_cookies;
	}

	
}

