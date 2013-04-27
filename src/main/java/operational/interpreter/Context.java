package operational.interpreter;

import java.util.StringTokenizer;

public class Context 
{
	private StringTokenizer tokens;
	
	public Context(String input) {
	
	}
	
	public String nextToken() {
		return tokens.nextToken();
	}
	
	public boolean hasNext() {
		return tokens.hasMoreTokens();
	}
}
