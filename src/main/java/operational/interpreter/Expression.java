package operational.interpreter;

public interface Expression<T> 
{
	T interpret(Context context);
}
