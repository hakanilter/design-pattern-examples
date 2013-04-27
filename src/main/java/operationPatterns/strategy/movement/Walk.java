package operationPatterns.strategy.movement;

import operationPatterns.strategy.base.MovementType;
import operationPatterns.strategy.base.MovementType;

public class Walk implements MovementType
{
	@Override
	public void move() {
		System.out.println("walks");
	}
}
