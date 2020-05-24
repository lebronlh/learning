package designpattern.singlepattern.Lazy;

/**
 * 被外部类调用的时候内部类才会加载，懒加载。但是线程不安全
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}

    private  static  LazySimpleSingleton singleton =null;

   /* public static  LazySimpleSingleton getInstance(){
        if (singleton==null)
            singleton = new LazySimpleSingleton();
        return singleton;
    }*/

   //改进版
    public synchronized  static  LazySimpleSingleton getInstance(){
        if(singleton ==null)
            singleton = new LazySimpleSingleton();
        return singleton;
    }
}
