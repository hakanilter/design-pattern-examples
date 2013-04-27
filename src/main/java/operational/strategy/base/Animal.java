package operational.strategy.base;

import java.util.HashSet;
import java.util.Set;

public abstract class Animal 
{
	private int legCount;
	private Set<Environment> availableEnvironments = new HashSet<Environment>();
	
	public Animal(int legCount, Environment... environments) 
	{
		this.legCount = legCount;
		for (Environment environment : environments) {
			availableEnvironments.add(environment);
		}
	}
	
	public int getLegCount() {
		return legCount;
	}
	
	public void move(Environment environment) {
		if (!availableEnvironments.contains(environment)) {
			System.out.println("can't move");
			return;
		}
		environment.getMovementType().move();
	}
}
