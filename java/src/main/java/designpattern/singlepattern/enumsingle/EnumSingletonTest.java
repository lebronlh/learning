package designpattern.singlepattern.enumsingle;

import designpattern.singlepattern.destorysingle.SeriableSingleton;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {
    @Test
    public void test() {
        try {
            EnumSingleton instance1 = null;
            EnumSingleton instance2 = EnumSingleton.getInstance();

            instance2.setData(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        Class<?> clazz = EnumSingleton.class;
        try {
            /*Constructor<?> c = clazz.getDeclaredConstructor();
            c.newInstance();
            //枚举类Enum只有一个protected的构造方法，因此出现异常
            */
            Constructor<?> c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton singleton = (EnumSingleton) c.newInstance("TOM", 666);
            //java.lang.IllegalArgumentException: Cannot reflectively create enum objects
            //即不能用反射来创建枚举类型
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
