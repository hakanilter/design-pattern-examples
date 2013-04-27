package constructional.factory.southern;

import constructional.factory.cook.Cook;
import constructional.factory.food.Hamburger;
import constructional.factory.food.Soup;

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
