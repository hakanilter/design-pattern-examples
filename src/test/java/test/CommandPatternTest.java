package test;

import operational.command.OrderDrinkCommand;
import operational.command.OrderFoodCommand;
import operational.command.VisualMenu;

public class CommandPatternTest 
{
	public static void main(String[] args) 
	{
		VisualMenu menu = new VisualMenu(3);
		menu.addCommand(new OrderDrinkCommand())
			.addCommand(new OrderFoodCommand());
		menu.setVisible(true);
	}
}
