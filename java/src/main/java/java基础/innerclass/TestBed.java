package java基础.innerclass;

import org.junit.Test;

public class TestBed {
    public void f() { System.out.println("f()"); }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
        @Test
        public void test(){
            java基础.innerclass.Test.A.iniInner();
            System.out.println(java基础.innerclass.Test.A.b);
        }
    }
}