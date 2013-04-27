package factory.northern;

import factory.cook.Cook;
import factory.food.Hamburger;
import factory.food.Soup;

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
