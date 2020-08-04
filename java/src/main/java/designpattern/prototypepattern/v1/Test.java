package designpattern.prototypepattern.v1;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 =new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p1.age+" "+p1.score);
        System.out.println(p2.age+" "+p2.score);

        //引用地址也被copy过来了，所以p1和p2的loc都指向同一个对象，这就是浅克隆
        System.out.println(p2.loc);
        System.out.println(p1.loc==p2.loc);
        p1.loc.roomNO=25;
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
        return super.clone();
    }

}

class Location{
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
}
