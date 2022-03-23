package class02_strategy.comparator;

import java.util.Arrays;

/**
 * Desc:策略模式(Comparator的使用)，比Comparable更灵活更容易扩展
 * 补充：开闭原则(软件中的对象（类，模块，函数等等）应该对于扩展是开放的，但是对于修改是封闭的)
 * @author zzs
 * @date 2022/3/22 22:30
 */
public class Main {

    public static void main(String[] args) {
        // Dog[] dogs = {new Dog(3), new Dog(5), new Dog(1)};
        // Sorter<Dog> sorter = new Sorter<>();
        // sorter.sort(dogs, new DogComparator());
        // System.out.println(Arrays.toString(dogs));
        Cat[] cats = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats, (o1, o2)->{
            if (o1.weight < o2.weight) {
                return -1;
            } else if (o1.weight > o2.weight) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(cats));
    }
}
