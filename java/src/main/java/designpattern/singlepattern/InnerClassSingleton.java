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

    private static  class LazyHolder{
        private static  final InnerClassSingleton LAZY = new InnerClassSingleton();
    }
}
