package designpattern.singlepattern.destorysingle;

import java.io.*;

/**
 * 反序列化导致破坏单例模式
 */

public class SeriableSingleton implements Serializable {
    /**
     * 序列化就是把内存中的状态通过转换成字节码的形式
     * 从而转换一个I/O流，写入其他地方（可以使磁盘）
     * 内存中的状态会永久保存下来
     * <p>
     * <p>
     * 反序列化就是将已经持久化的字节码内容转换为I/O流
     * 通过I/O流的读取，进而将读取的内容转换为JAVA对象
     * 在转换过程中会重新创建对象new
     */

    public final static SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return instance;
    }
    /**
     * 未加readResolve方法前从结果可以看出，反序列化的对象和手动创建的对象是不一致的，实例化了两次，违背了单例模式的设计初衷。
     * 加了readResolve方法后 问题得到解决(实际上是实例化了两次 只是第二次实例化的结果并没有被返回  不算完全解决  枚举类有效解决)
     */
    private Object readResolve(){
        return instance;
    }

    //测试代码
    public static void main(String[] args) {
        SeriableSingleton s1=null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
