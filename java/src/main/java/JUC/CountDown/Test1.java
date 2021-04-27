package JUC.CountDown;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("sleep");
                }
                System.out.println("thread1");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2");
            }

        });

        thread1.start();
        thread2.start();
        //join()方法的作用是让main线程在线程1和2执行完后再执行
        thread1.join();
        thread2.join();

        System.out.println("all");
    }
}
