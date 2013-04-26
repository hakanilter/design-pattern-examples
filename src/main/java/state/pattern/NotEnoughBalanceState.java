package state.pattern;

import java.math.BigDecimal;

public class NotEnoughBalanceState extends BaseState
{
	public NotEnoughBalanceState(UltimateCoffeeMachine coffeeMachine) {
		super(coffeeMachine);
	}

	@Override
	public void addCoin(BigDecimal coin) 
	{
		coffeeMachine.balance = coffeeMachine.balance.add(coin);
		if (coffeeMachine.balance.compareTo(UltimateCoffeeMachine.PRICE) >= 0) {
			coffeeMachine.state = new EnoughBalanceState(coffeeMachine);
		}
		System.out.println("coin added, current balance: " + coffeeMachine.balance);
	}
}
