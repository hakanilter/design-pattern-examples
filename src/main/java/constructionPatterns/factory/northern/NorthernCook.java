package constructionPatterns.factory.northern;

import constructionPatterns.factory.cook.Cook;
import constructionPatterns.factory.food.Hamburger;
import constructionPatterns.factory.food.Soup;

public class NorthernCook implements Cook 
{
	@Override
	public Soup createSoup() {
		return new NorthernSoup();
	}

	@Override
	public Hamburger createHamburger() {
		return new NorthernHamburger();
	}
}
