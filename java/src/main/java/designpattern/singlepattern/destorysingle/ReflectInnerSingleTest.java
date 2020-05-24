package designpattern.singlepattern.destorysingle;

import designpattern.singlepattern.InnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例模式
 */
public class ReflectInnerSingleTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = InnerClassSingleton.class;
            //通过反射获取构造方法
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            //强制访问
            constructor.setAccessible(true);
            //暴力初始化，并调用两次构造方法
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();

            System.out.println(o1==o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
