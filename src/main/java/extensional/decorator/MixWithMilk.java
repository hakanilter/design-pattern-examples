package extensional.decorator;

public class MixWithMilk extends Mix 
{
	public MixWithMilk(Drink drink) {
		super(drink);
	}
	
	@Override
	public String toString() {
		return super.toString() + " with milk";
	}
	
}
