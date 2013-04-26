package strategy.animal;

import strategy.base.Animal;
import strategy.base.Environment;

public class Cat extends Animal 
{
	public Cat() {
		super(4, Environment.LAND, Environment.WATER);
	}
}
