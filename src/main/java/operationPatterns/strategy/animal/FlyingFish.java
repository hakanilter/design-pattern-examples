package operationPatterns.strategy.animal;

import operationPatterns.strategy.base.Environment;
import operationPatterns.strategy.base.Animal;
import operationPatterns.strategy.base.Environment;

public class FlyingFish extends Animal 
{
	public FlyingFish() {
		super(0, Environment.WATER, Environment.AIR);
	}
}
