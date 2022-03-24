package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(10);
        values.add(1,6);
        values.forEach(System.out::println);
    }
}
