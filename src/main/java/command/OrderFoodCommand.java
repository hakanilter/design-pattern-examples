package command;

public class OrderFoodCommand implements Command 
{
	@Override
	public String getName() {
		return "Order Food";
	}

	@Override
	public void execute() {
		System.out.println("food ordered");
	}
}
