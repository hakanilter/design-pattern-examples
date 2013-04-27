package operational.state.pattern;

import java.math.BigDecimal;

import operational.state.common.Coffee;
import operational.state.common.CoffeeMachine;
import operational.state.common.CoffeeType;

public abstract class BaseState implements CoffeeMachine
{
	protected UltimateCoffeeMachine coffeeMachine;
	
	public BaseState(UltimateCoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}
	
	@Override
	public void addCoin(BigDecimal coin) {
		throw new IllegalStateException();
	}

	@Override
	public void order(CoffeeType coffeeType) {
		throw new IllegalStateException();
	}

	@Override
	public void prepare() {
		throw new IllegalStateException();
	}

	@Override
	public Coffee getOrder() {
		throw new IllegalStateException();
	}

	@Override
	public void cancel() {
		throw new IllegalStateException();
	}
}
