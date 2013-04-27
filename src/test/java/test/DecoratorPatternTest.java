package test;

import org.junit.Test;

import extensional.decorator.Coffee;
import extensional.decorator.Drink;
import extensional.decorator.MixWithIce;
import extensional.decorator.MixWithMilk;
import extensional.decorator.Tea;

/**
 *
 * Belirli kombinasyonlarda farki tiplerin bir araya 
 * getirilmesi gerektiginde bir suru inheritance yapmak yerine 
 * Decorator kullanilabilir
 * 
 * Ornek: Java I/O API
 * 
 */
public class DecoratorPatternTest 
{
	@Test
	public void test()
	{
		Drink drink1 = new MixWithIce(new MixWithMilk(new Tea()));
		System.out.println(drink1);
		Drink drink2 = new MixWithMilk(new MixWithIce(new Coffee()));
		System.out.println(drink2);
	}
}
