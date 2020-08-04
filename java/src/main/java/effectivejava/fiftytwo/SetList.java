package effectivejava.fiftytwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i =-3;i<3;i++){
            set.add(i);
            list.add(i);
        }
        System.out.println("set:"+set);
        System.out.println("list" +list);

        for (int i = 0;i<3;i++){
            set.remove(i);
            list.remove(i);//调用重载方法remove（int）根据位置remove
        }
        System.out.println("-------------");

        System.out.println("set:"+set);
        System.out.println("list" +list);
    }
}
