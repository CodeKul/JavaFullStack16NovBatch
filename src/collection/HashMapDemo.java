package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1,"Pooja");
        students.put(2,"Nilima");
        students.put(3,"Keshav");
        students.put(4,"Kavita");
        students.put(5,"Rahul");
        students.put(3,"James"); //replace with keshav
        students.put(null,null);
        students.put(6,null);
        System.out.println(students);
        for (Map.Entry<Integer,String> entry : students.entrySet()){
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
        }

        students.replace(2,"Nilima1","Jay");
        System.out.println(students.replace(1,"Sangita"));
        System.out.println("Contains key: "+students.containsKey(10));
        System.out.println("Contains Value: "+students.containsValue("Rahul"));
        System.out.println("Get value by key "+ students.get(6));
        System.out.println("Remove : "+students.remove(6));
        System.out.println("Remove : "+students.remove(3,"James"));
        System.out.println(students);
    }
}
