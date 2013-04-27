package responsibility.flyweight;

public class Page 
{
	private Character[][] content = new Character[24][80];
	
	public void addChar(char c, int row, int col) {
		content[row][col] = new Character(c);
	}
	
	public void addCharWithFactory(char c, int row, int col) {
		content[row][col] = CharFactory.INSTANCE.getChar(c);
	}
}
