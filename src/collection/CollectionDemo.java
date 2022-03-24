package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Basic Method:
 * add()
 * remove()
 * addAll()
 * removeAll()
 * size()
 * isEmpty()
 * clear()
 */
public class CollectionDemo {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 51;
        a[3] = 53;
        a[4] = 523;
        a[1] = 5;
        a[2] = 25;
        //a[5] = 54;
        Collection values = new ArrayList();
        values.add(5);
        values.add("str1");
        values.add("6");
        values.add(5.8);
        values.add(9);
        //first way
        Iterator i =  values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        //second way
        for (Object o : values){
            System.out.println(o);
        }
        //third way
        values.forEach(System.out::println);

    }
}
