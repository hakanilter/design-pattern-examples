package test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import operational.strategy.animal.Cat;
import operational.strategy.animal.Fish;
import operational.strategy.animal.FlyingFish;
import operational.strategy.base.Animal;
import operational.strategy.base.Environment;

/**
 * If, else, switch gibi ifadeler coklasmissa burada 
 * strategy pattern kullanmaya uygun olabilir
 */
public class StrategyPatternTest 
{
	@Test
	public void test()
	{
		List<Animal> animals = Arrays.asList(new Fish(), new Cat(), new FlyingFish()); 
		for (Animal animal : animals) {
			System.out.print(animal.getClass().getSimpleName() + ": ");
			animal.move(Environment.LAND);
		}
	}
}
