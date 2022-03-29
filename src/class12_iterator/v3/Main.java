package class12_iterator.v3;

/**
 * Desc:添加容器的共同接口，实现容器的替换
 * @author zzs
 * @date 2022/3/29 13:42
 */
public class Main {

    public static void main(String[] args) {
        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());
    }
}
