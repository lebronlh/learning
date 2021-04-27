package genericity.泛型擦除;

import org.junit.Test;

import java.util.ArrayList;

public class Test2 {

    /**
     * new ArrayList()只是在内存中开辟了一个存储空间，可以存储任何类型对象，
     * 而真正设计类型检查的是它的引用，因为我们是使用它引用list1来调用它的方法，
     * 比如说调用add方法，所以list1引用能完成泛型类型的检查。而引用list2没有使用泛型，所以不行。
     */
    @Test
    public void test(){
        ArrayList<String> list1 = new ArrayList(); //第一种 情况
        list1.add("1"); //编译通过
        //list1.add(1); //编译错误
        String str1 = list1.get(0); //返回类型就是String
        ArrayList list2 = new ArrayList<String>(); //第二种 情况
        list2.add("1"); //编译通过
        list2.add(1); //编译通过
        Object object = list2.get(0); //返回类型就是Object
    }
}
