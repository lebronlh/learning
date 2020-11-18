package jvm.String;

/*
成员变量（非静态）复制过程：①默认初始化-②显示初始化/代码块中初始化③构造器初始化④有了对象后，可以“对象.属性”或“对象.方法”的方式
对成员变量进行初始化
 */
class Father{
    int x = 10;//显示初始化

    public Father() {
        this.print();
        x = 20;
    }

    public void print() {
        System.out.println("Father.x =" + x);
    }
}


class Son extends Father{
    int x =30;

    public Son() {
        this.print();
        x = 40;
    }

    @Override
    public void print() {
        System.out.println("Son.x =" + x);
    }
}

public class SonTest {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }

}

