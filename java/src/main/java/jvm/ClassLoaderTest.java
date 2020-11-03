package jvm;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //jdk1.8

        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //注：ext设定为AppClassLoader的parent在launcher构造方法里面设置的


        //获取上层：扩展类加载器，两者并不为继承关系
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@511d50c0

        //再获取上层,获取不到引导类加载器
        System.out.println(extClassLoader.getParent()); //null

        //对用户自定义类来说，默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //string类使用引导类加载器进行加载---->java的核心类库都是使用引导类加载器进行加载
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);//null

    }
}
