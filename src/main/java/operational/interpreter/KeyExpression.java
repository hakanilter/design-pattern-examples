package operational.interpreter;

public class KeyExpression implements Expression<String> 
{
	@Override
	public String interpret(Context context) {
		return context.nextToken().trim();
	}
}
