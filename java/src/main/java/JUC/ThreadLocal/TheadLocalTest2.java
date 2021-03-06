package JUC.ThreadLocal;

public class TheadLocalTest2 {
    private static Index num = new Index();
    //创建一个Index类型的本地变量
    private static ThreadLocal<Index> local = new ThreadLocal<Index>() {
        @Override
        protected Index initialValue() {
            return num;
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int j = 0; j < 5; j++) {
            threads[j] = new Thread(new Runnable() {
                public void run() {
                    //取出当前线程的本地变量，并累加10000次
                    Index index = local.get();
                    for (int i = 0; i < 10000; i++) {
                        index.increase();
                    }
                    System.out.println(Thread.currentThread().getName() + " : "+ index.num);

                }
            }, "Thread-" + j);
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }

    static class Index {
        int num;

        public void increase() {
            num++;
        }
    }
}
