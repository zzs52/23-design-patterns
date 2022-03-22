package class02_strategy.comparable;

import java.util.Arrays;

/**
 * Desc:策略模式之前言(Comparable的使用)
 * @author zzs
 * @date 2022/3/22 22:19
 */
public class Main {

    public static void main(String[] args) {
        // Dog[] dogs = {new Dog(3), new Dog(5), new Dog(1)};
        // Sorter.sort(dogs);
        // System.out.println(Arrays.toString(dogs));
        Cat[] cats = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        Sorter.sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
