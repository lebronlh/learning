package Enum.Five;

import org.junit.Test;

public class SimpleEnumUse {
    //在创建ennum时，编译器会添加一些有用特性，比如tostring（）方法,ordinal()方法（声明顺序）
    @Test
    public  void test1() {
        Spiciness hotHot = Spiciness.MEDIUM;
        System.out.println(hotHot);
    }

    @Test
    public void test2(){
        //enum的values方法可以遍历enum实例，并且保持声明时的顺序
        for(Spiciness s:Spiciness.values())
            System.out.println(s+",ordinal "+ s.ordinal());
    }
}
