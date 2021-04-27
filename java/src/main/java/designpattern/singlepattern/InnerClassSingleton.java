package designpattern.singlepattern;

/**
 * 静态内部类的形式实现慢加载单例模式
 * 兼顾了饿汉式单例模式的内存浪费问题和synchronized造成的性能问题
 */
public class InnerClassSingleton {
   // private InnerClassSingleton(){}
    private InnerClassSingleton(){
        /**
         * 最牛的单例模式实现方式，防止反射破坏单例模式
         */
        if(LazyHolder.LAZY!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final InnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    /**
     * 静态内部类模式如何保证线程安全：静态内部类加载的时候，去初始化静态域，这个初始化过程有jvm保证线程安全
     * 并且是static final保证只初始化一次
     */
    private static  class LazyHolder{
        private static  final InnerClassSingleton LAZY = new InnerClassSingleton();
    }
}
