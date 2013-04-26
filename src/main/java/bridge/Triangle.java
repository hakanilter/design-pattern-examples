package bridge;

public class Triangle 
{
	private ImageEditor imageEditor;
	
	public void draw()
	{
		imageEditor.drawLine();
		imageEditor.drawLine();
		imageEditor.drawLine();
	}
	
	public void setImageEditor(ImageEditor imageEditor) {
		this.imageEditor = imageEditor;
	}
}
