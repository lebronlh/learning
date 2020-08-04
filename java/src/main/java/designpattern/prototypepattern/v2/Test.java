package designpattern.prototypepattern.v2;

public class Test {
    /**
     * 深克隆test
     * 要点：1、深克隆重写clone方法
     * 2、string类型不需要深克隆（string在常量池 是共享的）
     * string类型被更改时 直接指向新的string对象；所以p1更改时，p1指向新的string对象而p2不变，指向原来的；故肯定不一样
     * 当string对象是new 出来的时候 也一样，因为 栈的引用指向堆对象，堆对象 仍然指向常量池的string对象
     *
     * stringbuileder 需要考虑深拷贝的问题
     * @param args
     * @throws CloneNotSupportedException
     */

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 =new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p1.age+" "+p1.score);
        System.out.println(p2.age+" "+p2.score);

        //深克隆，重写clone方法
        System.out.println(p2.loc);
        System.out.println(p1.loc==p2.loc);

        System.out.println(p1.loc.street);
        System.out.println(p1.loc.roomNO==p2.loc.roomNO);
        p1.loc.roomNO=25;
        p1.loc.street="sh";
        System.out.println(p1.loc);
        System.out.println(p2.loc);


        p1.age= 100;
        System.out.println(p1.age);
        System.out.println(p2.age);
    }



}

class Person implements  Cloneable{
    int age = 8;
    int score = 100;
    Location loc = new Location("bj",22);

    public Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.loc= (Location) loc.clone();
        return p;
    }

}

class Location implements Cloneable{
    String street;
    int roomNO;

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNO='" + roomNO + '\'' +
                '}';
    }

    public Location(String street, int roomNO) {
        this.street = street;
        this.roomNO = roomNO;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
