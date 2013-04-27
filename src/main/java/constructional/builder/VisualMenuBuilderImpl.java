package constructional.builder;

import java.util.ArrayList;
import java.util.List;

import operational.command.Command;
import operational.command.VisualMenu;

public class VisualMenuBuilderImpl implements VisualMenuBuilder 
{
	private List<Command> commands = new ArrayList<Command>(); 

	@Override
	public VisualMenuBuilder addCommand(Command command) 
	{
		commands.add(command);
		return this;
	}
	
	@Override
	public VisualMenu getMenu() 
	{
		VisualMenu menu = new VisualMenu(commands.size()); 
		for (Command command : commands) {
			menu.addCommand(command);
		}
		return menu;
	}
}
