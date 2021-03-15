package 多态;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {
        Person doctor = new Doctor("1","2","3");
        System.out.println(doctor);

        Person student =  new Student();
        Student student1 =new Student();

        Person teacher = new Teacher();

        List<Person> list = new ArrayList<>();
        list.add(doctor);
        list.add(teacher);
        list.add(student);

        for (Person person : list) {
            System.out.println(person.getClass());
        }


    }


    @Test
    public void test(){
        Student student =new Student();
        methodb(student);
        System.out.println(student.getAge());
    }

    private void methodb(Student student) {
        student.setAge("12");
    }
}
