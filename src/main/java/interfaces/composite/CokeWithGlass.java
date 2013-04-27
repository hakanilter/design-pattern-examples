package interfaces.composite;

public class CokeWithGlass extends CompositeProduct
{
	public CokeWithGlass() 
	{
		add(new Coke());
		add(new Glass());
	}
}
