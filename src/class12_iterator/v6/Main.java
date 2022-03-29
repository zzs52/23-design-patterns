package class12_iterator.v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Desc:JDK的容器的Iterator
 * @author zzs
 * @date 2022/3/29 13:57
 */
public class Main {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 15; i++) {
            c.add(new String("s" + i));
        }

        Iterator it = c.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
