import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    @org.junit.Test
    public void test(){
       Set<Integer> integers = Set.of(1,3,4);
       Set<Double> doubles = Set.of(2.0,4.0,6.0);
       Set<Number> numbers=Set.of(1,2.0,3);
        Set<? extends Number> union = union(integers, numbers);
        System.out.println(union);
    }

   public static <E> Set<E> union(Set<? extends E> s1,
                                  Set<? extends E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return  result;
   }

    @org.junit.Test
    public void testList() throws IllegalAccessException {
        List<Object> objects = Collections.emptyList();
        System.out.println(objects.size());
        System.out.println(objects);

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
