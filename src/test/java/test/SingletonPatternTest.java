package test;

import org.junit.Test;

import singleton.Car;
import singleton.CarFactory;

/**
 * 
 * JVM genelinde bir sinifin tek bir instance'i 
 * olmasini istersek kullaniriz 
 *
 */
public class SingletonPatternTest 
{
	@Test
	public void test()
	{
		// Car car = new Car();
		
		CarFactory carFactory = CarFactory.getInstance();
		Car car = carFactory.getCar();
		System.out.println(car);
	}
}
