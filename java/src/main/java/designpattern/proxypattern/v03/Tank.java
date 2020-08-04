package designpattern.proxypattern.v03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

interface Movable {
  void move();
}

//jdk动态代理
/*反编译源码可知，
* 生成的代理类里面调用move方法时，会调用handler的invoke方法，super.h.invoke*/
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("TANK moving");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
       Tank tank =new Tank();
      /*
      Class<Tank> tankClass = Tank.class;//Class类
      Class[] classes = new Class[]{Movable.class};//Class数组
        */

        Movable m=(Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象
             * @param method 被代理的方法
             * @param objects 被代理的方法需要的参数
             * @return
             * @throws Throwable
             */

            @Override
            public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
                System.out.println(method.getName() + "  start");
                //mehod指move方法，传的tank 故调用的是tank的的move方法
                Object o = method.invoke(tank, args);
                System.out.println(method.getName() + " end");
                return o;
            }
        });
        m.move();



    }
}


