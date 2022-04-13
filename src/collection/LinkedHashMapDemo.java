package collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101,"C");
        linkedHashMap.put(102,"C++");
        linkedHashMap.put(103,"Java");
        linkedHashMap.put(104,"HTML");
        linkedHashMap.put(105,"CSS");
        System.out.println(linkedHashMap);
    }
}
