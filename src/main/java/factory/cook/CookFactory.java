package factory.cook;

import factory.northern.NorthernCook;
import factory.southern.SouthernCook;

public final class CookFactory 
{
	public static Cook getNorthernCook() {
		return new NorthernCook();
	}
	
	public static Cook getSouthernCook() {
		return new SouthernCook();
	}
}
