import lh.entry.Complex;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Complex complex[] =new Complex[10];
        System.out.println(complex[0]);
    }

    @org.junit.Test
    public void test(){
       String s ="23";
    }

   public static <E> Set<E> union(Set<? extends E> s1,
                                  Set<? extends E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return  result;
   }

    @org.junit.Test
    public void testList() throws IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       list.add(0,5);
        System.out.println(list);

    }

    int min(int... args) throws IllegalAccessException {
        if(args.length==0)
            throw new IllegalAccessException("too few arguments");

        int min =args[0];
        for (int arg : args) {
            if(arg<min)
                min = arg;
        }
        return min;

    }
}
