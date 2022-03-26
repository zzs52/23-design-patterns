package class06_decorator;

public class Carpenter implements Worker{
    @Override
    public void doSomething() {
        System.out.println("修理门窗");
    }
}
