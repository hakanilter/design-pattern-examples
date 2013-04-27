package test;

import org.junit.Test;

import responsibility.flyweight.CharFactory;
import responsibility.flyweight.Page;

/** 
 * Cok sayida nesne olusturmak gerektigi durumlarda 
 * daha az hafiza kullanmak icin degismeyen ortak ozellikleri 
 * varsa bunlari paylastiracak bir obje havuzu olusturmakta kullanilir
 * 
 * Ornek: text editor
 */
public class FlyweightPatternTest 
{
	@Test
	public void test()
	{
		Page page = new Page();
		for (int i = 0; i < 24*80; i++) {
			page.addCharWithFactory('A', i % 24, i % 80);
		}
		System.out.println("Number of instance: " + CharFactory.INSTANCE.getSize());
 	}
}
