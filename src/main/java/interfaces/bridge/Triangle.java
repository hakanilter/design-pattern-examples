package interfaces.bridge;

public class Triangle extends Shape
{
	@Override
	public void draw()
	{
		imageEditor.drawLine();
		imageEditor.drawLine();
		imageEditor.drawLine();
	}
}
