package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        Deque<Integer> values = new ArrayDeque<>();
        values.addFirst(10);
        System.out.println("Head First:"+values);
        values.offerFirst(20);
        System.out.println("Offer First:"+values);
        values.addLast(30);
        System.out.println("Tail Last:"+values);
        values.offerLast(40);
        System.out.println("Offer Tail:"+values);
        System.out.println("Get First:"+values.getFirst());
        System.out.println("Peek First:"+values.peekFirst());
        System.out.println("Get Last:"+values.getLast());
        System.out.println("Peek Last:"+values.peekLast());
        System.out.println("Remove First:"+values.removeFirst());
        System.out.println("Poll First"+values.pollFirst());
        System.out.println("Remove Last"+values.removeLast());
        System.out.println("Poll Last"+values.pollLast());
        System.out.println("Values "+values);
        Deque<String> alphabets = new ArrayDeque<>();
        alphabets.addFirst("A");
        alphabets.offerFirst("B");
        alphabets.addLast("C");
        alphabets.offerLast("D");
        System.out.println("alphabets "+alphabets);
    }
}
