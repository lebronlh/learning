package jvm;

public class DynamicLinkingTest {
    int num =10;
    public void methodA(){
        System.out.println("MethodA()....");
    }

    public void methodB(){
        System.out.println("B...");

        methodA();
        num++;
    }
}
