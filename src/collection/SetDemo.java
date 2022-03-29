package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

        Set<Integer> values = new TreeSet<>();
        values.add(87);
        values.add(67);
        values.add(89);
        values.add(71);
        values.add(25);
        values.add(89);
        System.out.println(values);
    }
}
