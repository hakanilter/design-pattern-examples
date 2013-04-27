package constructional.factory.cook;

import constructional.factory.food.Hamburger;
import constructional.factory.food.Soup;

public interface Cook 
{
	Soup createSoup();
	Hamburger createHamburger();
}
