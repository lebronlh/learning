package java基础.innerclass;

public class Test {
    private int test;
    private static int test1;
    static {
        System.out.println("外部类Test被加载");
    }

    void ini(){
        test =1;
    }



    class B{
        int testB =1;
        public void b(){
            System.out.println(test1);
        }
    }

    static class A{

        static int b =1;
        static {
            System.out.println("内部类A被加载");
        }

        public static void iniInner(){
            System.out.println("内部类静态方法被调用");
            //System.out.println("调用外部类属性"+test1);
        }
    }

    public static void main(String[] args) {


    }

    @org.junit.Test
    public void test(){

        Test aa = new Test();
        Test.B test = new Test.B();
        test.b();



    }
}

