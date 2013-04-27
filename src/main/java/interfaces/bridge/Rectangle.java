package interfaces.bridge;

public class Rectangle extends Shape 
{
	@Override
	public void draw()
	{
		imageEditor.drawLine();
		imageEditor.drawLine();
		imageEditor.drawLine();
		imageEditor.drawLine();
	}
}
