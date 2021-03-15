package jvm;

import org.openjdk.jol.info.ClassLayout;

public class ObjectTest {
    public static void main(String[] args) {
        Object o = new Object();
        String layout = ClassLayout.parseInstance(o).toPrintable();
        System.out.println(layout);
        System.out.println("----------");
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
