package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("React JS");
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Next.js");
        System.out.println(languages);
        languages.remove(2);
        System.out.println(languages);
        languages.remove("Python");
        System.out.println(languages);
        languages.set(2,"Ruby");
        System.out.println("lang "+languages);

        ArrayList<String> languages1 = new ArrayList<>();
        languages1.add("React JS");
        languages1.add("Java");
        System.out.println("lang1 "+languages1);
        languages.removeAll(languages1);
        System.out.println("Remaining " +languages);
    }
}
