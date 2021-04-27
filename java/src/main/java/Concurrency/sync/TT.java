package Concurrency.sync;

import org.openjdk.jol.info.ClassLayout;


public class TT {


    public static void main(String[] args) {
        T t = new T();
        /**
         * OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
         *       0     4        (object header)                           01 00 00 00 (00000001 00000000 00000000 00000000) (1)
         *       4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
         *       8     4        (object header)                           43 c1 00 f8 (01000011 11000001 00000000 11111000) (-134168253)
         *      12     4        (alignment/padding gap)
         *      16     8   long T.m                                       0
         * Instance size: 24 bytes
         * Space losses: 4 bytes internal + 0 bytes external = 4 bytes total
         */
        System.out.println(ClassLayout.parseInstance(t).toPrintable());

        /*synchronized (t){
            System.out.println(ClassLayout.parseInstance(t).toPrintable());
        }*/
        /**
         * OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
         *       0     4        (object header)                           08 f1 1d 03 (00001000 11110001 00011101 00000011) (52293896)
         *       4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
         *       8     4        (object header)                           43 c1 00 f8 (01000011 11000001 00000000 11111000) (-134168253)
         *      12     4        (alignment/padding gap)
         *      16     8   long T.m                                       0
         * Instance size: 24 bytes
         * Space losses: 4 bytes internal + 0 bytes external = 4 bytes total
         */
    }

    private static  class T{
        int m;
    }
}
