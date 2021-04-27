package java基础.errortest;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    public static void main(String[] args) {
        //long start = System.currentTimeMillis();
        List<byte[]> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(new byte[5 * 1024 * 1024]);
            System.out.println("分配次数：" + (++i));
        }


    }
}
