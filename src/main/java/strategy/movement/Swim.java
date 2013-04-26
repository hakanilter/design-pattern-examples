package strategy.movement;

import strategy.base.MovementType;

public class Swim implements MovementType 
{
	@Override
	public void move() {
		System.out.println("swims");
	}
}