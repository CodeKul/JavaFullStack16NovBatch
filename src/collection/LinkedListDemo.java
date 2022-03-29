package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Litchi");
        fruits.add("Grapes");
        System.out.println(fruits);
        fruits.addFirst("Guava");
        System.out.println(fruits);
        fruits.addLast("Orange");
        System.out.println(fruits);
        fruits.offer("Strawberry");
        System.out.println(fruits);
        System.out.println("First "+fruits.peek());
        Iterator stringIterator =  fruits.descendingIterator();
        System.out.println("Reverse sequence order");
        while (stringIterator.hasNext()){
            System.out.println("fruit "+stringIterator.next());
        }
        fruits.sort(String::compareToIgnoreCase);
        System.out.println("Sort "+fruits);
    }
}
//Do the demo on vector & stack