package responsibilityPatterns.singleton;

public class ThreadSafeLazyInitializationSingletonCarFactory
{
    private volatile static ThreadSafeLazyInitializationSingletonCarFactory instance = null;

    public static final ThreadSafeLazyInitializationSingletonCarFactory getInstance()
    {
        // double-checked locking
        if (instance == null) {
            synchronized (ThreadSafeLazyInitializationSingletonCarFactory.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyInitializationSingletonCarFactory();
                }
            }
        }
        return instance;
    }

    private ThreadSafeLazyInitializationSingletonCarFactory()
    {
        System.out.println("building a new factory...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("factory is ready");
    }
}
