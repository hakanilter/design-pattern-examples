package test;

import operational.command.OrderDrinkCommand;
import operational.command.OrderFoodCommand;
import operational.command.VisualMenu;
import constructional.builder.VisualMenuBuilder;
import constructional.builder.VisualMenuBuilderImpl;

/**
 * 
 * Bazi durumlarda nesnelerin olusturulmasi
 * birden fazla adimdan ve belli bir sirayla olmalidir.
 * Bu durumda Builder kullanilabilir.
 *
 */
public class BuilderPatternTest 
{
	public static void main(String[] args) 
	{
		VisualMenuBuilder builder = new VisualMenuBuilderImpl();
		builder.addCommand(new OrderFoodCommand());
		builder.addCommand(new OrderDrinkCommand());
		builder.addCommand(new OrderFoodCommand());
		
		VisualMenu menu = builder.getMenu();
		menu.setVisible(true);
	}
}
