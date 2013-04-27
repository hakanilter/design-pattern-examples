package responsibility.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TxProxyHandler implements InvocationHandler 
{
	private Object target;
	
	public TxProxyHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
	{
		Object result = null;
		
		try {
			System.out.println("starting transaction...");
			result = method.invoke(target, args);
			System.out.println("transaction completed");
		} catch (Exception e) {
			System.out.println("transaction failed");
			throw new RuntimeException(e);
		}
		
		return result;
	}
}
