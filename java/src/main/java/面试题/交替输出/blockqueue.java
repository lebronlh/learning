package 面试题.交替输出;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class blockqueue {
    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aC ="abcdefg".toCharArray();

        TransferQueue<Character> queue = new LinkedTransferQueue<>();

        new Thread(()->{
            for (char c : aC) {
                try {
                    System.out.println(queue.take());//阻塞队列，先向队列里放，然后阻塞到消费者消费完才继续
                    queue.transfer(c);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"t1").start();

        new Thread(()->{
            for (char c : aI) {
                try {
                    queue.transfer(c);
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2").start();


    }
}
