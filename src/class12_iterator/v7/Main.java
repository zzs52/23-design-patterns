package class12_iterator.v7;

/**
 * Desc:实现泛型版本
 * @author zzs
 * @date 2022/3/29 14:15
 */
public class Main {

    public static void main(String[] args) {
        Collection_<String> list = new ArrayList_<String>();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        Iterator_<String> it = list.iterator();
        while (it.hasNext()) {
            String o = it.next();
            System.out.println(o);
        }
    }
}
