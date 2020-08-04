package compar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorTest {

    @Test
    public void test1() {
        Students s1 = new Students();
        s1.setHeight("123");
        Students s2 = new Students();
        s2.setHeight("456");
        Students s3 = new Students();
        s3.setHeight("789");

        /*StudentCompartor compartor =new StudentCompartor();
        System.out.println(compartor.compare(s1, s2));*/

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s2);
        Collections.sort(studentsList, new Comparator<Students>() {
            @Override
            public int compare(Students t1, Students t2) {
                //根据字符串height排序
                return t1.getHeight().compareTo(t2.getHeight());
             }
        }.reversed());
        for (Students students : studentsList) {
            System.out.println(students+" "+students.getHeight());
        }
    }

    @Test
    public void test2(){

    }
}
