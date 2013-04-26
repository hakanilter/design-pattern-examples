package strategy.movement;

import strategy.base.MovementType;

public class Walk implements MovementType 
{
	@Override
	public void move() {
		System.out.println("walks");
	}
}
