package test;

import org.junit.Test;

import prototype.Menu;
import prototype.Tea;

/**
 *
 * Bir nesnenin belirli bir durumdaki kopyalarina 
 * ihtiyac var ise kullanilir
 *
 */
public class PrototypePatternTest
{
	@Test
	public void testJavaClone()
	{
		Menu menu = new Menu();
		
		Tea tea1 = menu.getTeaWithOneSugar();
		Tea tea2 = menu.getTeaWithOneSugar();
		tea2.setSugarCount(2);
		Tea tea3 = menu.getTeaWithOneSugar();
		
		System.out.println(tea1 + " " + tea1.getSugarCount());
		System.out.println(tea2 + " " + tea2.getSugarCount());
		System.out.println(tea3 + " " + tea3.getSugarCount());
	}
}
