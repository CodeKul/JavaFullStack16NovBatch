package collection;

import java.util.*;

/**
 * unordered collection
 * unique elements
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> vegetables = new HashSet<>();
        System.out.println(vegetables.add("BabyCorn"));
        System.out.println(vegetables.add("Broccoli"));
        System.out.println(vegetables.add("Tomato"));
        System.out.println(vegetables.add("Spinach"));
        System.out.println(vegetables.add("Cauliflower"));
        System.out.println(vegetables.add("Tomato"));
        System.out.println(vegetables);

        Set<Integer> values = new HashSet<>();
        values.add(87);
        values.add(67);
        values.add(89);
        values.add(71);
        values.add(25);
        values.add(89);
        values.add(null);
        values.add(null);
        System.out.println("HashSet: "+values);

        SortedSet<Integer> values1 = new TreeSet<>();
        values1.add(5);
        values1.add(3);
        values1.add(2);
        values1.add(1);
        values1.add(0);
        values1.add(4);
        System.out.println("TreeSet: "+values1);
    }
}
