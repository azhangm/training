package day08.Que;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo1 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        deque.addLast("d");
        String s = deque.peekFirst();
        System.out.println(s);
        System.out.println(deque);
        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }
        System.out.println(deque);
    }
}
