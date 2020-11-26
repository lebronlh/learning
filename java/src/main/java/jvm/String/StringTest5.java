package jvm.String;

import org.junit.Test;

public class StringTest5 {

    @Test
    public void test1(){
        String s1 ="a"+"b"+"c";
        String s2 ="abc";

        /**
         * 最终.java编译成.class，再执行
         * String s1 ="abc";
         * String s2 ="abc";
         *
         */
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

    @Test
    public void test2(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE"+"hadoop";
        //如果连接前后出现了变量，则需要在堆空间中new string（），具体内容为拼接的结果
        String s5 = s1+"hadoop"; //StringBuilder
        String s6 = "javaEE" + s2;
        String s7 = s1+s2;

        System.out.println(s3==s4);//t
        System.out.println(s3==s5);//f
        System.out.println(s3==s6);//f
        System.out.println(s3==s7);//f
        System.out.println(s5==s6);//f
        System.out.println(s5==s7);//f
        System.out.println(s6==s7);//f

        String s8 = s6.intern();
        System.out.println(s3==s8);//t

    }

    /**
     * 1、字符串拼接操作不一定使用stringbuilder！，
     * 如果拼接符号左右两边都是字符串常量或者常量引用，则仍然使用编译器优化，即非stringbuilder的方式
     */
    @Test
    public void test5(){
        final  String s1 = "a";
        final  String s2 = "b";
        String s3 ="ab";
        String s4 = s1+s2;
        System.out.println(s3==s4);
    }
}
