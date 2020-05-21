package Enum.NineTeen;

import org.junit.Test;

public class EnumClass {

    //Enum类实现了Comparable接口，所以它具有compareTo（）方法。
    @Test
    public void test(){
        for (Shrubbery s:Shrubbery.values()){
            System.out.println(s+",ordinal "+ s.ordinal());
            System.out.printf(s.compareTo(Shrubbery.CRAWLING)+" ");
            System.out.printf(s.equals(Shrubbery.CRAWLING)+" ");
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("------------------------------");
        }

    }

/*valueof方法 根据名字返回实例 */
    @Test
    public void  test2(){
        for(String s:"HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrubbery);
        }
    }
}
