package operationPatterns.state.common;

public class Coffee 
{
	private CoffeeType coffeeType;
	
	public Coffee(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}
	
	public CoffeeType getCoffeeType() {
		return coffeeType;
	}

	@Override
	public String toString() {
		return "Coffee [coffeeType=" + coffeeType + "]";
	}
 }
