package designpattern.proxypattern.dynamicproxy;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws Exception {
        Person obj = (Person) new JDKMeipo().getInstance(new Customer());
        obj.findLove();

    }

}

interface Person{
    public void findLove();
}

class JDKMeipo implements InvocationHandler{
    //被代理的对象，把引用保存下来
    private Object target;

    public Object getInstance(Object target)throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       before();
       Object obj = method.invoke(this.target,args);
       after();
       return obj;
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }

}

class Customer implements Person{

    public void findLove() {
        System.out.println("单身汉的要求");
    }
}


