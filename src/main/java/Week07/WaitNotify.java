package Week07;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @CLASSNAME:WaitNotify
 * @AUTHOR: wangteng
 * @TIME: 2020-07-2111:08
 */
public class WaitNotify {


    private static final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);


    public static void main(String[] args) {
        WaitNotify notify = new WaitNotify();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

//        executorService.execute(new WaitNotify.Producer());
    }


    class Producer implements Runnable {

        @Override
        public void run() {
            System.out.println("============生产了=============");
            queue.offer(1);
        }

    }

    class Consumer implements Runnable {

        @Override
        public void run() {

            Integer poll = queue.poll();
            System.out.println("==========消费了-----------------=====");
        }

    }


}
