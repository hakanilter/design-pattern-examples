package constructionPatterns.factory.cook;

import constructionPatterns.factory.northern.NorthernCook;
import constructionPatterns.factory.southern.SouthernCook;
import constructionPatterns.factory.northern.NorthernCook;
import constructionPatterns.factory.southern.SouthernCook;

public final class CookFactory 
{
	public static Cook getNorhernCook() {
		return new NorthernCook();
	}
	
	public static Cook getSouthernCook() {
		return new SouthernCook();
	}
}
