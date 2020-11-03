package leecode;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test")
public class Test {
    public static void main(String[] args) {
       /* Runnable r = new Thread(){
            @Override
            public void run(){
                log.debug("runnning");
            }
        };*/

        Runnable r = new Runnable() {
            @Override
            public void run() {
                log.debug("running");
            }
        };

        log.debug("run");
        Thread t = new Thread(r);
        t.start();
        System.out.println("run");
    }

    @org.junit.Test
    public void test1(){
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }

    public int fib(int n){
        /*if(n == 0 || n == 1)
            return n;
        else
            return fib(n-1)+fib(n-2);*/
         int a =0;
         int b =1;
         int sum;
         while(n>0){
             sum = (a+b)% 1000000007;
             a = b;//b值是上一个sum，赋予a后，故返回a
             b = sum;
             n--;
         }
         return a;
    }
}
