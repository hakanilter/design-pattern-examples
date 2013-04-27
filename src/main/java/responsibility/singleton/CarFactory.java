package responsibility.singleton;

public final class CarFactory
{
    // eager initialization
    private static CarFactory instance = new CarFactory();

    public static CarFactory getInstance() {
        return instance;
    }

    private CarFactory()
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
