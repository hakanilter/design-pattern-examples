package constructional.factory.northern;

import constructional.factory.cook.Cook;
import constructional.factory.food.Hamburger;
import constructional.factory.food.Soup;

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
