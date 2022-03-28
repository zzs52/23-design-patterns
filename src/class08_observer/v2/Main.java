package class08_observer.v2;

/**
 * Desc:面向对象
 * @author zzs
 * @date 2022/3/28 12:49
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while(!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
        child.wakeUp();
    }
}

class Child {

    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up! Crying wuwuwuwu...");
        cry = true;
    }
}
