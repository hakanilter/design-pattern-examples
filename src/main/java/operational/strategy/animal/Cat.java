package operational.strategy.animal;

import operational.strategy.base.Environment;
import operational.strategy.base.Animal;

public class Cat extends Animal 
{
	public Cat() {
		super(4, Environment.LAND, Environment.WATER);
	}

}
