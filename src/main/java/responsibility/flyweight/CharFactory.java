package responsibility.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharFactory 
{
	public static final CharFactory INSTANCE = new CharFactory();
	
	private Map<Integer, Character> charMap = new HashMap<Integer, Character>();
	
	private CharFactory() {
		
	}
	
	public Character getChar(char c) 
	{
		if (charMap.containsKey(c)) {
			return charMap.get(c);
		}
		Character character = new Character(c);
		charMap.put(new Integer(c), character);
		return character;
	}
	
	public int getSize() {
		return charMap.size();
	}
}
