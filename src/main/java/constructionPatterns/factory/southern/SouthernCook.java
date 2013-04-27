package constructionPatterns.factory.southern;

import constructionPatterns.factory.cook.Cook;
import constructionPatterns.factory.food.Hamburger;
import constructionPatterns.factory.food.Soup;

public class SouthernCook implements Cook
{
	@Override
	public Soup createSoup() {
		return new SouthernSoup();
	}

	@Override
	public Hamburger createHamburger() {
		return new SouthernHamburger();
	}
}
