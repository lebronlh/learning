package designpattern.singlepattern;

import org.junit.Test;

public class TestSingleton {

  /*
  饿汉式加载
  private static final  TestSingleton singleton = new TestSingleton();

    private TestSingleton(){

    }

    public TestSingleton getInstance(){
        return singleton;
    }*/

   /*
   懒汉式
   private static TestSingleton singleton;

   private  TestSingleton(){

   }

   public TestSingleton getInstance(){
       return  new TestSingleton();
   }*/

   //双重检查
    private volatile TestSingleton singleton;

    private  TestSingleton(){

    }

    public TestSingleton getInstance(){
        if(singleton==null){
            synchronized (TestSingleton.class){
                if(singleton==null)
                    singleton= new TestSingleton();
            }
        }
        return singleton;
    }

    @Test
    public void test(){
        SingletonEnum instance = SingletonEnum.getInstance();
        SingletonEnum instance1 = SingletonEnum.getInstance();
        System.out.println(instance==instance1);
    }
}
