package test;

import junit.framework.Assert;

import org.junit.Test;

import constructional.prototype.Menu;
import constructional.prototype.Tea;

/**
 *
 * Bir nesnenin belirli bir durumdaki kopyalarina 
 * ihtiyac var ise kullanilir
 * 
 * Java icerisindeki clone metodunda sikintilar var
 * deep copy yapmiyor bu yuzden kullanilmasi tavsiye edilmiyor
 * Bunun icin Copy Constructor
 *
 */
public class PrototypePatternTest
{
	@Test(expected=RuntimeException.class)
	public void testJavaClone()
	{
		Menu menu = new Menu();
		
		Tea tea1 = menu.getCloneTeaWithOneSugar();
		Tea tea2 = menu.getCloneTeaWithOneSugar();
		tea2.setSugarCount(2);
		Tea tea3 = menu.getCloneTeaWithOneSugar();
		
		System.out.println(tea1 + " " + tea1.getSugarCount());
		System.out.println(tea2 + " " + tea2.getSugarCount());
		System.out.println(tea3 + " " + tea3.getSugarCount());
		
		// same object!
		if (tea1.getList() == tea2.getList()) {
			throw new RuntimeException();
		}
	}
	
	@Test
	public void testCopyConstructor()
	{
		Menu menu = new Menu();
		
		Tea tea1 = menu.getCopyTeaWithOneSugar();
		Tea tea2 = menu.getCopyTeaWithOneSugar();
		
		System.out.println(tea1 + " " + tea1.getSugarCount());
		System.out.println(tea2 + " " + tea2.getSugarCount());

		Assert.assertNotSame(tea1.getList(), tea2.getList());
	}
}
