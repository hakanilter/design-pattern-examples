package strategy.animal;

import strategy.base.Animal;
import strategy.base.Environment;

public class FlyingFish extends Animal 
{
	public FlyingFish() {
		super(0, Environment.WATER, Environment.AIR);
	}
}
