package Week04;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @CLASSNAME:Singlton
 * @AUTHOR: wangteng
 * @TIME: 2020-07-0212:49
 */
public class Singlton {

    private volatile static Singlton singlton = null;

    public Singlton(){

    }

    public  static Singlton getInstance(){

        if(null == singlton){
            synchronized (Singlton.class){
                if(null == singlton){
                    singlton = new Singlton();
                }
            }
        }

        return singlton;
    }



}
