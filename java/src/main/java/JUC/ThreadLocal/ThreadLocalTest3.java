package JUC.ThreadLocal;

public class ThreadLocalTest3 {
    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(1);
        threadLocal.set(2);
        threadLocal.set(3);
        threadLocal.set(4);

        System.out.println(threadLocal.get());
    }
}
