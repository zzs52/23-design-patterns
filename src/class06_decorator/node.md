### 装饰者模式
1.假设有一个Worker接口，它有一个doSomething方法，Plumber和Carpenter都实现了Worker接口
```text
public interface Worker {
    void doSomething();
}

public class Plumber implements Worker{
    @Override
    public void doSomething() {
        System.out.println("修理水管");
    }
}

public class Carpenter implements Worker{
    @Override
    public void doSomething() {
        System.out.println("修理门窗");
    }
}

public class Main {

    public static void main(String[] args) {
        Worker worker = null;
        Plumber plumber = new Plumber();
        worker = plumber;
        worker.doSomething();
        
        Carpenter carpenter = new Carpenter();
        worker = carpenter;
        worker.doSomething();
    }
}
```
2.现有A、B两家公司，都有木工(Carpenter)和水管工(Plumber)，但两公司的对两个工种的要求都不同

A公司要求员工在doSomething前自己介绍“我是A公司的”；

B公司要求员工在doSomething前自己介绍“我是B公司的”；

一个直接但不科学的设计方法是为每个公司都设计各自的木工(Carpenter)和水管工(Plumber)，若公司增加到100个，则类要增加到200个，若再增加其他工种，则类会更多

此情况适合采用装饰者模式，为每个公司设计一个装饰类xWorker，xWorker也实现Worker接口，且有一个参数类型为Worker的构造函数和一个类型为Worker的成员变量，这样xWorker就可以取得相应类型worker的引用，在xWorker的doSomething()方法里处理各自公司的特殊要求
```text
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

public class Main {

    public static void main(String[] args) {
        Carpenter carpenterA = new Carpenter();
        Plumber plumberA = new Plumber();
        AWorker aWorker1 = new AWorker(carpenterA);
        AWorker aWorker2 = new AWorker(plumberA);
        aWorker1.doSomething();
        aWorker2.doSomething();

        Carpenter carpenterB = new Carpenter();
        Plumber plumberB = new Plumber();
        BWorker bWorker1 = new BWorker(carpenterB);
        BWorker bWorker2 = new BWorker(plumberB);
        bWorker1.doSomething();
        bWorker2.doSomething();
    }
}
```