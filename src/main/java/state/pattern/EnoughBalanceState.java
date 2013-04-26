package state.pattern;

import java.math.BigDecimal;

import state.common.CoffeeType;

public class EnoughBalanceState extends BaseState 
{
	public EnoughBalanceState(UltimateCoffeeMachine coffeeMachine) {
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
	
	@Override
	public void order(CoffeeType coffeeType) 
	{
		if (coffeeMachine.balance.compareTo(UltimateCoffeeMachine.PRICE) >= 0) {
			coffeeMachine.balance = coffeeMachine.balance.subtract(UltimateCoffeeMachine.PRICE);
			coffeeMachine.state = new OrderedState(coffeeMachine, coffeeType);
		}
		System.out.println("coffee ordered, current balance: " + coffeeMachine.balance);
	}
}
