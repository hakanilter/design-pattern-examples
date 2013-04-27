package operational.strategy.movement;

import operational.strategy.base.MovementType;

public class Walk implements MovementType
{
	@Override
	public void move() {
		System.out.println("walks");
	}
}
