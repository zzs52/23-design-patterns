package class06_decorator;

public class BWorker implements Worker{

    private Worker worker;

    public BWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doSomething() {
        System.out.println("您好！我是B公司的员工。");
        worker.doSomething();
    }
}
