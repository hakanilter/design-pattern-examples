package operational.strategy.animal;

import operational.strategy.base.Environment;
import operational.strategy.base.Animal;

public class FlyingFish extends Animal 
{
	public FlyingFish() {
		super(0, Environment.WATER, Environment.AIR);
	}
}
