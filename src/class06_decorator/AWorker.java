package class06_decorator;

public class AWorker implements Worker{

    private Worker worker;

    public AWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doSomething() {
        System.out.println("您好！我是A公司的员工。");
        worker.doSomething();
    }
}
