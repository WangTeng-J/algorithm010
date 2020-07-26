package Week07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @CLASSNAME:ReadWriteLock
 * @AUTHOR: wangteng
 * @TIME: 2020-07-2210:02
 */
public class ReadWriteLockClass {


    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock writelock = lock.writeLock();
    Lock readLock   = lock.readLock();

    AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(()->{
            new ReadWriteLockClass().doAdd();
        });
        executorService.execute(()->{
            new ReadWriteLockClass().doGet();
        });

    }

    private void doAdd(){
        writelock.lock();
        while (atomicInteger.get()>10){
            try {
                writelock.wait();
            } catch (InterruptedException e) {

            }finally {
//                readLock.notifyAll();
//                writelock.notifyAll();
            }
        }
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);
        readLock.notifyAll();
        writelock.unlock();
    }

    private void doGet(){
        readLock.lock();
        while (atomicInteger.get()==0){
            try {
                readLock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
//                writelock.notifyAll();
//                readLock.notifyAll();
            }
        }

        int i = atomicInteger.incrementAndGet();
        System.out.println(i);
        writelock.notifyAll();
        readLock.unlock();
    }




}
