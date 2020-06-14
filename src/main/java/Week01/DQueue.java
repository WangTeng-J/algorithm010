package Week01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class DQueue {
    public static void main(String[] args) {

        Deque<String> queue = new LinkedList<>();

        queue.addFirst("a");
        queue.addFirst("B");
        queue.addFirst("C");
        System.out.println("=========ADD First========="+queue.toString() );

        System.out.println(queue.pollLast());
        System.out.println(queue.pollFirst());

        queue.addLast("D");
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());
        System.out.println(queue.toString());


    }
}
