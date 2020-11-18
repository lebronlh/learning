package jvm.String;

public class StringTest {

    public static void main(String[] args) {
        String str = new String("hello")+new String("world");
        String str1 = "helloworld";
        System.out.println(str==str1);

        //字节码
        /**
         * 0 new #2 <java/lang/StringBuilder>     new一个stringbuilder
         *  3 dup                                   复制一份创建的对象
         *  4 invokespecial #3 <java/lang/StringBuilder.<init>> 调用stringbuilder的init初始化方法
         *  7 new #4 <java/lang/String> new 一个string  "hello"
         * 10 dup                       复制一份
         * 11 ldc #5 <hello>            加载到操作数栈中
         * 13 invokespecial #6 <java/lang/String.<init>>
         * 16 invokevirtual #7 <java/lang/StringBuilder.append>
         * 19 new #4 <java/lang/String>   new 一个string "world"
         * 22 dup
         * 23 ldc #8 <world>
         * 25 invokespecial #6 <java/lang/String.<init>>
         * 28 invokevirtual #7 <java/lang/StringBuilder.append>
         * 31 invokevirtual #9 <java/lang/StringBuilder.toString>  "helloworld"（Stringbuilder的tostring方法 new了一个string）
         * 34 astore_1
         * 35 ldc #10 <helloworld>
         * 37 astore_2
         * 38 getstatic #11 <java/lang/System.out>
         * 41 aload_1
         * 42 aload_2
         * 43 if_acmpne 50 (+7)
         * 46 iconst_1
         * 47 goto 51 (+4)
         * 50 iconst_0
         * 51 invokevirtual #12 <java/io/PrintStream.println>
         * 54 return
         */
    }
}
