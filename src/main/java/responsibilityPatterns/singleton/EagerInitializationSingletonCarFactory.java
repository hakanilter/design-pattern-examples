package responsibilityPatterns.singleton;

public final class EagerInitializationSingletonCarFactory
{
    // eager initialization
    private static EagerInitializationSingletonCarFactory instance = new EagerInitializationSingletonCarFactory();

    public static final EagerInitializationSingletonCarFactory getInstance() {
        return instance;
    }

    private EagerInitializationSingletonCarFactory()
    {
        System.out.println("building a new factory...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("factory is ready");
    }

    public Car getCar() {
        return new Car();
    }
}

