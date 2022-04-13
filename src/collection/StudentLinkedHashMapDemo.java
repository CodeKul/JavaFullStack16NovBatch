package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class Student1{
    private Integer rno;
    private String name;

    public Integer getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public Student1(Integer rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class StudentLinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Student1> student1LinkedHashMap = new LinkedHashMap<>();

        Student1 s1 = new Student1(1,"Aditya");
        student1LinkedHashMap.put(101,s1);

        Student1 s2 = new Student1(2,"Vipin");
        student1LinkedHashMap.put(102,s2);

        System.out.println(student1LinkedHashMap);

        for (Map.Entry<Integer,Student1> entry : student1LinkedHashMap.entrySet()){
            Student1 student1 = entry.getValue();
            System.out.println("-----------------------------------");
            System.out.println("Key: "+entry.getKey());
            System.out.println("Roll no. "+student1.getRno());
            System.out.println("Name: "+student1.getName());
        }

        Iterator iterator = student1LinkedHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


