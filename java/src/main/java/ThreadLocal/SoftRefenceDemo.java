package ThreadLocal;

import java.lang.ref.SoftReference;

public class SoftRefenceDemo {
    public static void main(String[] args)  {
        //softReference是强引用，指向的byte数组是弱引用，指向一个10M的内存空间
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024*1024*10]);
        System.out.println(softReference.get());
        System.gc();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(softReference.get());
        System.out.println(softReference);
        byte[] b = new byte[15*1024*1024];
        System.out.println(softReference.get());//-Xmx设置最大堆内存25M，此时软引用已被回收故为null
        System.out.println(softReference);
    }
}
