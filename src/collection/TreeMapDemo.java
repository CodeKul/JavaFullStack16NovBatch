package collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(108,"Pooja");
        treeMap.put(101,"Diksha");
        treeMap.put(105,"Chaitanya");
        treeMap.put(102,"Anup");
        treeMap.put(107,"Shubham");
        System.out.println(treeMap);
    }
}
