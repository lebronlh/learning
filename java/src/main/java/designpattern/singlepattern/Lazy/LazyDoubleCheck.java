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
                    //三条jvm指令
                    //1、分配内存2、初始化3、设置instance指向分配的地址有可能会被指令集优化成132.
                }
            }
        }
        return instance;
    }
}

