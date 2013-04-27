package constructionPatterns.factory.cook;

import constructionPatterns.factory.food.Hamburger;
import constructionPatterns.factory.food.Soup;

public interface Cook 
{
	Soup createSoup();
	Hamburger createHamburger();
}
