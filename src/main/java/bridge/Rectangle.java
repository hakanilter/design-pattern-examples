package bridge;

public class Rectangle 
{
	private ImageEditor imageEditor;
	
	public void draw()
	{
		imageEditor.drawLine();
		imageEditor.drawLine();
		imageEditor.drawLine();
		imageEditor.drawLine();
	}
	
	public void setImageEditor(ImageEditor imageEditor) {
		this.imageEditor = imageEditor;
	}
}
