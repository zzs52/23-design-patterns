package class03_factory.factorymethod;

// 简单工厂的扩展性不是很好，使用这种
public class SimpleVehicleFactory {

    public Car createCar() {
        // before processing
        return new Car();
    }

    public Broom createBroom() {
        // before processing
        return new Broom();
    }
}
