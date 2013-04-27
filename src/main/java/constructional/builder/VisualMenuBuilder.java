package constructional.builder;

import operational.command.Command;
import operational.command.VisualMenu;

/**
 * 
 * {@link VisualMenu}
 *
 */
public interface VisualMenuBuilder 
{
	VisualMenuBuilder addCommand(Command command);
	VisualMenu getMenu();
}
