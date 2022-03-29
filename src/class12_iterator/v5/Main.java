package class12_iterator.v5;

/**
 * Desc:迭代器模式(用一种统一的遍历方式，要求每一个容器都要提供Iterator的实现类)
 * @author zzs
 * @date 2022/3/29 13:56
 */
public class Main {

    public static void main(String[] args) {
        Collection_ list = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        Iterator_ it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
