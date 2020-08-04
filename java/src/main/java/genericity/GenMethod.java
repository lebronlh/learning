package genericity;

import java.util.function.UnaryOperator;

public class GenMethod {

    private static UnaryOperator<Object> IDENTITY_FN=(t)->t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static void main(String[] args) {
        String[] strings ={"jute","hemp","nylon"};
        UnaryOperator<Object> sameString = identityFunction();
        for (String string : strings) {
            Object apply = sameString.apply(string);
            System.out.println(apply.getClass());
            System.out.println(sameString.apply(string));
        }

    }
}
