package designpattern.singlepattern;

public class HungrySingleton {
    /**
     * 饿汉式单例模式：
     *      优点：没有任何锁，效率高。用户体验比懒汉式好
     *      缺点：类加载的时候就初始化。不管用于不用都占着空间，浪费了内存
     */
  /*  第一种写法
  private static  final HungrySingleton singleton = new HungrySingleton();

    private  HungrySingleton(){}

    public static  HungrySingleton getInstance(){
        return singleton;
    }*/

  //第二种写法 静态代码块
    private static  final HungrySingleton singleton;
    static {
        singleton = new HungrySingleton();
    }
    public HungrySingleton(){};

    public static  HungrySingleton getInstance(){
        return singleton;
    }

}
