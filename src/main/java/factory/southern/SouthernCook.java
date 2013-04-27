package factory.southern;

import factory.cook.Cook;
import factory.food.Hamburger;
import factory.food.Soup;

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
