package operational.strategy.base;

import operational.strategy.movement.Fly;
import operational.strategy.movement.Swim;
import operational.strategy.movement.Walk;

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
