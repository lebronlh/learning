package ThreadLocal;

import java.lang.ref.WeakReference;

public class WeakDemo {
    public static void main(String[] args) {
        WeakReference<M> m = new WeakReference<M>(new M());

        System.out.println(m.get());
        System.gc();
        System.out.println(m.get());
    }
}
