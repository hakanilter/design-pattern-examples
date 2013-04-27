package extensionPatterns.decorator;

public abstract class Mix implements Drink 
{
	private Drink drink;
	
	public Mix(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String toString() {
		return drink.toString();
	}
}
