package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> values = new LinkedHashSet();
        values.add(87);
        values.add(67);
        values.add(89);
        values.add(71);
        values.add(25);
        values.add(89);
        values.add(null);
        values.add(null);
        System.out.println(values);
    }
}
