package operationPatterns.strategy.animal;

import operationPatterns.strategy.base.Environment;
import operationPatterns.strategy.base.Animal;
import operationPatterns.strategy.base.Environment;

public class Cat extends Animal 
{
	public Cat() {
		super(4, Environment.LAND, Environment.WATER);
	}

}
