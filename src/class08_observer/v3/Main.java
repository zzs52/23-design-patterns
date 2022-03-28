package class08_observer.v3;

/**
 * 加入观察者
 */
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        while(!c.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
        c.wakeUp();
    }
}

class Child {

    private boolean cry = false;
    private Dad d = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        d.feed();
    }
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}
