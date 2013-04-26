package state.common;

import java.math.BigDecimal;

public interface CoffeeMachine 
{
	void addCoin(BigDecimal coin);
	void order(CoffeeType coffeeType);
	void prepare();
	Coffee getOrder();
	void cancel();
}
