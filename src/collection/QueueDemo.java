package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> values = new PriorityQueue<>();
        values.add(5);
        values.add(10);
        values.add(20);
        values.add(25);
        values.add(30);
        System.out.println("Values "+values);
        System.out.println("Element : "+values.element());
        System.out.println("Peek : "+values.peek());
        System.out.println("Poll : "+values.poll());
        System.out.println("After Polling: "+values);
        values.offer(50);
        System.out.println("After offer: "+values);
        values.add(55);
        System.out.println("Values "+values);
    }
}
