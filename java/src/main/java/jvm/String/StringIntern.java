package jvm.String;

public class StringIntern {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();//调用次方法前，字符串常量池中已经存在了"1"
        String s2 = "1";
        System.out.println(s == s2);


        //s3的变量记录的地址为：new  string("11")
        String s3 = new String("1")+new String("1");
        //执行完上一行代码后，字符串常量池中，不存在"11"
        s3.intern();//在字符串常量池中生成"11"，如何理解：
        // jdk6：创建了一个新对象"11"，也就有新的地址
        //jdk7:此时常量池中并没有创建"11"，而是创建一个指向堆空间中new string("11")的地址

        String s4 = "11";//s4变量记录的地址：上一行代码执行时，在字符串常量池中生成的"11"的地址
        System.out.println(s3==s4);
    }
}
