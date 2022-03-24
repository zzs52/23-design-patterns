package class03_factory.factorymethod;

public class CarFactory {

    public Moveable create() {
        // before processing 例：System.out.println("a car created!");
        return new Car();
    }
}
