package 面试题.交替输出;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class lock_condition {
    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aC ="abcdefg".toCharArray();
        ReentrantLock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();//队列

        new Thread(() -> {
            lock.lock();

            try {
                for (char c : aI) {
                    System.out.println(c);
                    condition2.signal();
                    condition1.await();
                }
                condition2.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

        }, "t1").start();

        new Thread(() -> {
            lock.lock();

            try {
                for (char c : aC) {
                    System.out.println(c);
                    condition1.signal();
                    condition2.await();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            condition1.signal();

        }, "t2").start();
    }
}
