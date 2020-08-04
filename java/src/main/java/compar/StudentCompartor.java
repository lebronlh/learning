package compar;

import java.util.Comparator;

public class StudentCompartor implements Comparator<Students> {
    @Override
    public int compare(Students t1, Students t2) {
        //根据字符串height排序
        return t1.getHeight().compareTo(t2.getHeight());
    }
}
