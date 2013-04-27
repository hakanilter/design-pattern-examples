package responsibility.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityProxyHandler implements InvocationHandler 
{
	private Object target;
	
	public SecurityProxyHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
	{
		Object result = null;
		
		System.out.println("checking security constraints...");
		result = method.invoke(target, args);
		
		return result;
	}
}
