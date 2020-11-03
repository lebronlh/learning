package jvm;

import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderInitPathTest {
    public static void main(String[] args) {
        System.out.println("*****启动类加载器******");
        //获取BootStrapClassLoader能够加载api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/lib/resource.jar
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/lib/rt.jar
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/lib/sunrsasign.jar
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/lib/jsse.jar
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/lib/jce.jar
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/lib/charsets.jar
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/lib/jfr.jar
        //file:/D:/javadevelop/Java/jdk1.8.0_211/jre/classes
        //取rt.jar包下的Provider类做实验
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);//输出为空，表示是启动类加载器

        System.out.println("*****扩展类加载器****");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
    }
}
