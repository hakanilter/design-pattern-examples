package prototype;

public class Menu 
{
	private Tea teaWithOneSugar = new Tea(1);
	
	public Tea getCloneTeaWithOneSugar() 
	{
		try {
			return (Tea) teaWithOneSugar.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Tea getCopyTeaWithOneSugar() {
		return new Tea(teaWithOneSugar);
	}
}
