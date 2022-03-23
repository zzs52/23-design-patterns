package class02_strategy.comparator;

@FunctionalInterface
public interface Comparator<T> {

    int compare(T o1, T o2);

    default void sayHello() {
        System.out.println("hello world!");
    }
}
