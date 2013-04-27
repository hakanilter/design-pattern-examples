package operational.interpreter;

public class ValueExpression implements Expression<String> 
{
	@Override
	public String interpret(Context context) {
		return context.nextToken().trim();
	}
}
