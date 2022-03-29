package collection;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> countries = new Stack<>();
        countries.push("India");
        countries.push("USA");
        countries.push("Japan");
        System.out.println(countries);
        System.out.println("search string "+countries.search("India"));
        System.out.println("check existence "+countries.contains("USA"));
        System.out.println(countries);
        System.out.println("Peek element "+countries.peek());
        System.out.println(countries.capacity());
        countries.pop();
    }
}
