package class06_decorator;

public class Plumber implements Worker{
    @Override
    public void doSomething() {
        System.out.println("修理水管");
    }
}
