package collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * does not allow null
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> flowers = new PriorityQueue<>();
        flowers.add("Rose");
        flowers.add("Lotus");
        flowers.add("Lily");
        flowers.add("Marigold");
        flowers.add("Sunflower");
     //   flowers.add(null); NullPointerException exception occur
        System.out.println("Priority Queue list: "+flowers);
        System.out.println("Head: "+flowers.peek());
        System.out.println("Head: "+flowers.element());
        System.out.println("Offer: "+flowers.offer("Hibiscus"));
        System.out.println("After Offer "+flowers);
        System.out.println("Poll: "+flowers.poll());
        System.out.println("After polling "+flowers);
        System.out.println("Poll: "+flowers.poll());


        PriorityQueue<Integer> values = new PriorityQueue<>();
        values.add(20);
        values.add(30);
        values.add(25);
        values.add(5);
        values.add(10);
        System.out.println("Values "+values);
        System.out.println("Offer: "+values.offer(45));
        System.out.println("Values "+values);
        System.out.println("Poll "+values.poll());

    }
}
