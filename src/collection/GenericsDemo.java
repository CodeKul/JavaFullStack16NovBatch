package collection;

import constructor.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Parameterised type
 * it does not allow primitive data type
 * allow wrapper classes, user defined class
 */
public class GenericsDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person = new Person(5);
        list.add(person);
        System.out.println(list);
    }
}
