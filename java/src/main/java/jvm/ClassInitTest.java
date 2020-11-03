package jvm;

public class ClassInitTest {
    private static int num =1;
    static {
        num = 2;
        number =20;
    }

    public ClassInitTest() {
        int a =10;
    }


    private static int number = 10;//linking中的prepare阶段：number =0 --> initial :20-->10

    public static void main(String[] args) {
        System.out.println(num);
        System.out.println(number);
    }
}
