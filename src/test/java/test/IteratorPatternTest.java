package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import extensional.iterator.EvenNumbersIterator;

/**
 *
 * Collection'in veri yapisinin encapsule edilmesinde kullanilir
 * Kullanici collection icindeki verinin nasil tutuldugunu bilmek zorunda degildir
 *
 */
public class IteratorPatternTest 
{
	@Test
	public void test()
	{
		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			data.add(i);
		}
		
		EvenNumbersIterator iterator = new EvenNumbersIterator(data);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
