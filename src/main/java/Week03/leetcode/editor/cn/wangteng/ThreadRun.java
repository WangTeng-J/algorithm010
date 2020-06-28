package Week03.leetcode.editor.cn.wangteng;

import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @CLASSNAME:ThreadRun
 * @AUTHOR: wangteng
 * @TIME: 2020-06-2816:51
 */
public class ThreadRun {
    private static LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new MyThread());
        executorService.execute(new MyThread1());
    }


    static class MyThread implements Runnable {


        @Override
        public void run() {
            for(int i = 0; i<100000;i++){
                try {
                    queue.put(i);
                    System.out.println("===========put==========");
                    Thread.sleep(100l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThread1 implements Runnable {


        @Override
        public void run() {
            for(int i = 0; i<100000;i++){
                Integer poll = queue.poll();
                System.out.println(poll+"==========get============");
                try {
                    Thread.sleep(100l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
