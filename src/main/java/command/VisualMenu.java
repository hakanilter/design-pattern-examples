package command;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VisualMenu extends JFrame 
{
	private static final long serialVersionUID = 6708681062363497200L;

	public VisualMenu(int rows) 
	{
		setSize(400, 600);
		setLayout(new GridLayout(rows, 1));
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public VisualMenu addCommand(final Command command)
	{
		JButton button = new JButton();
		button.setText(command.getName());
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				command.execute();
			}
		});
		add(button);
		
		return this;
	}
	
	public static void main(String[] args) 
	{
		VisualMenu menu = new VisualMenu(3);
		menu.addCommand(new OrderDrinkCommand())
			.addCommand(new OrderFoodCommand());
		menu.setVisible(true);
	}
}