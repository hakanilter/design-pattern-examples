package bridge;

public abstract class Shape 
{
	protected ImageEditor imageEditor;
	
	public void setImageEditor(ImageEditor imageEditor) {
		this.imageEditor = imageEditor;
	}
	
	public abstract void draw();
}
