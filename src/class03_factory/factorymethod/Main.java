package class03_factory.factorymethod;

public class Main {

    public static void main(String[] args) {
        /*
        Moveable m = new Car();
        m.go();
         */

        /*
        Moveable m = new CarFactory().create();
        m.go();
         */

        SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();
        simpleVehicleFactory.createCar().go();
    }
}
