package operational.interpreter;

import java.util.Map;
import java.util.Properties;

public class PropertiesExpression implements Expression<Properties> 
{
	private PairExpression pairExpression = new PairExpression();
	
	@Override
	public Properties interpret(Context context) 
	{
		Properties properties = new Properties();
		while (context.hasNext()) {
			Map<String, String> map = pairExpression.interpret(context);
			for (Map.Entry<String, String> entry : map.entrySet()) {
				properties.setProperty(entry.getKey(), entry.getValue());	
			}
		}
		return properties;
	}
}
