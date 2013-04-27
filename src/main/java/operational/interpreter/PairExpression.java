package operational.interpreter;

import java.util.Collections;
import java.util.Map;

public class PairExpression implements Expression<Map<String, String>> 
{
	private KeyExpression keyExpression = new KeyExpression();
	private ValueExpression valueExpression = new ValueExpression();
	
	@Override
	public Map<String, String> interpret(Context context) 
	{
		String key = keyExpression.interpret(context);
		String value = valueExpression.interpret(context);
		return Collections.singletonMap(key, value);
	}
}
