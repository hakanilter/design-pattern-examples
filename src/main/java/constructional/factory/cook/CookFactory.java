package constructional.factory.cook;

import constructional.factory.northern.NorthernCook;
import constructional.factory.southern.SouthernCook;

public final class CookFactory 
{
	public static Cook getNorthernCook() {
		return new NorthernCook();
	}
	
	public static Cook getSouthernCook() {
		return new SouthernCook();
	}
}
