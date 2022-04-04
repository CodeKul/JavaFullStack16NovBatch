package collection;

import java.util.PriorityQueue;

public class Person implements Comparable<Person>{
    Integer id;
    String name;
    String mobile;


    public Person(Integer id, String name, String mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
class PersonPriorityDemo{
    public static void main(String[] args) {
        Person p1 = new Person(1,"Akshay","9865321452");
        Person p2 = new Person(2,"Meena","9865321452");
        Person p3 = new Person(3,"Zen","9865321452");
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(p1);
        priorityQueue.add(p2);
        priorityQueue.add(p3);
        for (Person person: priorityQueue){
            System.out.println("Id: "+person.id+",Name: "+person.name+", "+person.mobile);
        }
    }
}