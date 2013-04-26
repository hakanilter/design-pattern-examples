package decorator;

public class MixWithIce extends Mix 
{
	public MixWithIce(Drink drink) {
		super(drink);
	}
	
	@Override
	public String toString() {
		return super.toString() + " with ice";
	}
}
