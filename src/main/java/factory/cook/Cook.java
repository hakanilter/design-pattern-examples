package factory.cook;

import factory.food.Hamburger;
import factory.food.Soup;

public interface Cook 
{
	Soup createSoup();
	Hamburger createHamburger();
}
