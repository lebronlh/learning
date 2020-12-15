package JUC.ThreadLocal;

import org.junit.Test;

public class TheadLocalTest {

    public static final ThreadLocal<Integer> local = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Test
    public void test1(){
        Thread[] threads = new Thread[5];
        for(int i = 0;i<5;i++){
            threads[i]=new Thread(() -> {
                int num = local.get();
                for(int j =0;j<6;j++)
                    num++;

                local.set(num);
                System.out.println(Thread.currentThread().getName()+":"+local.get());
            },"Thread-"+i);
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }

    @Test
    public void test2(){

    }
}
