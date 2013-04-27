package test;

import org.junit.Test;

import responsibility.singleton.Car;
import responsibility.singleton.EagerInitializationSingletonCarFactory;

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
		
		EagerInitializationSingletonCarFactory carFactory = EagerInitializationSingletonCarFactory.getInstance();
		Car car = carFactory.getCar();
		System.out.println(car);
	}
}
