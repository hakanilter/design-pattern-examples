package strategy.base;

import strategy.movement.Fly;
import strategy.movement.Swim;
import strategy.movement.Walk;

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
