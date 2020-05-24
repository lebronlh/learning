package designpattern.singlepattern.Lazy;

public class LazyDoubleCheck {
    private volatile static LazyDoubleCheck instance = null;

    private LazyDoubleCheck() {
    }

    public static LazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheck.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}

