package strategy.movement;

import strategy.base.MovementType;

public class Fly implements MovementType 
{
	@Override
	public void move() {
		System.out.println("flies");
	}
}
