package test;

import org.junit.Test;

import constructional.factory.cook.Cook;
import constructional.factory.cook.CookFactory;

/**
 * 
 * Factory method: Nesne yaratim surecini encapsulate etmek icin kullanilir
 * 
 * Abstract Factory: bir grup nesnenin koordineli bicimde 
 * yaratilmasi gerektiginde kullanilir. Icerisinde factory metodlar barindirir
 * 
 */
public class FactoryPatternTest 
{
	@Test
	public void test()
	{
		Cook cook1 = CookFactory.getNorhernCook();
		System.out.println(cook1.createHamburger());
		System.out.println(cook1.createSoup());
		
		Cook cook2 = CookFactory.getSouthernCook();
		System.out.println(cook2.createHamburger());
		System.out.println(cook2.createSoup());		
	}
}
