package operationPatterns.strategy.base;

import operationPatterns.strategy.movement.Fly;
import operationPatterns.strategy.movement.Swim;
import operationPatterns.strategy.movement.Walk;

public enum Environment 
{
	LAND(new Walk()), 
	WATER(new Swim()), 
	AIR(new Fly());
	
	private MovementType movementType;
	
	private Environment(MovementType movementType) {
		this.movementType = movementType;
	}
	
	public MovementType getMovementType() {
		return movementType;
	}
}
