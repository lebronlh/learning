package designpattern.proxypattern.staticproxy;

/**
 * Father是代理对象，Son是真实对象；实现了对Son的增强单又没动Son的代码
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}

interface Person{
    public void findLove();
}

class Son implements Person{

    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}

class Father {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("it's ok!");
    }
}
