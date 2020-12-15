package jvm;

import org.junit.Test;

public class AddTest {

    public void test(){
        int a =10;
        a++;
    }

    public void  test2(){
        int a =10;
        int b =1;
        int c =a +b;
    }

    public void test3(){
        int a =10;
        a++;

        int b =10;
        ++b;
    }

    public void test4(){
        int a =10;
        int b =a++;

        int c =10;
        int d =++c;
    }


    @Test
    public void method(){
        int i =10;
        i = i++;
        System.out.println(i);//10,看字节码
    }
}
