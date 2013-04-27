package operational.state.pattern;

import java.math.BigDecimal;

import operational.state.common.CoffeeType;
import operational.state.common.Coffee;
import operational.state.common.CoffeeMachine;

public class UltimateCoffeeMachine implements CoffeeMachine
{
	public static final BigDecimal PRICE = new BigDecimal("1.00"); 

	BaseState state = new NotEnoughBalanceState(this);
	BigDecimal balance = new BigDecimal("0.00");
	
	@Override
	public void addCoin(BigDecimal coin) {
		state.addCoin(coin);
	}

	@Override
	public void order(CoffeeType coffeeType) {
		state.order(coffeeType);
	}

	@Override
	public void prepare() {
		state.prepare();
	}

	@Override
	public Coffee getOrder() {
		return state.getOrder();
	}

	@Override
	public void cancel() {
		state.cancel();
	}
}
