package operational.strategy.movement;

import operational.strategy.base.MovementType;

public class Swim implements MovementType 
{
	@Override
	public void move() {
		System.out.println("swims");
	}
}
