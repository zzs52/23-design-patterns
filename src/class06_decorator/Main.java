package class06_decorator;

/**
 * Desc:装饰者模式
 * @author zzs
 * @date 2022/3/26 22:03
 */
public class Main {

    public static void main(String[] args) {
//        Worker worker = null;
//        Plumber plumber = new Plumber();
//        worker = plumber;
//        worker.doSomething();
//
//        Carpenter carpenter = new Carpenter();
//        worker = carpenter;
//        worker.doSomething();

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
