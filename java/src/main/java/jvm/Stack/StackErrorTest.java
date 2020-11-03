package jvm.Stack;

public class StackErrorTest {
    /**
     * 演示栈的异常
     * 默认情况下：11420
     * 设置栈的大小：-Xss256k,变成2476
     */
    private static int count =1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
