package JUC.AQSLearning;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class LockSupportDemo {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1正在执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LockSupport.park();
                System.out.println("线程1继续执行");
            }
        },"t1");


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2正在执行");
                LockSupport.unpark(thread1);

            }
        },"t2");
        thread2.start();
        //Thread.sleep(100);
        thread1.start();
    }





}
