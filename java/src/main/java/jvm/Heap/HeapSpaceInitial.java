package jvm.Heap;

/**
 * -Xms 用来设置堆空间的初始内存大小
 *          -X 是jvm的运行参数
 *          ms 是memory start
 *
 * - Xmx  用来设置堆空间的最大内存大小
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory()/1024/1024;
        long max = Runtime.getRuntime().maxMemory()/1024/1024;

        System.out.println("-Xms:"+initialMemory+"M");
        System.out.println("-Xmx:"+max+"M");
    }

}
