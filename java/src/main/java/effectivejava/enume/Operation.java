package effectivejava.enume;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public enum Operation {
    PLUS("+"){
        @Override
        public double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS("-"){
        @Override
        public double apply(double x, double y) {
            return x-y;
        }
    };

    private final String symbol;

    private static final Map<String,Operation> stringToEnum = Stream.of(Operation.values()).collect(
            Collectors.toMap(Objects::toString,e -> e)
    );

    Operation(String symbol) {
        System.out.println("构造方法");
        this.symbol = symbol;
    }

 /*   @Override
    public String toString() {
        return   symbol;
    }*/

    public abstract double apply(double x, double y);

    public static Optional<Operation> fromString(String symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }



    public static void main(String[] args) {
        System.out.println(stringToEnum);
        //Operation minus = Operation.MINUS;
        System.out.println(Operation.PLUS.getClass());
        System.out.println("111");
        /*String x = "6";
        String y = "20";
        double xx = Double.parseDouble(x);
        double yy = Double.parseDouble(y);


        for(Operation op:Operation.values()){
            System.out.printf("%f %s %f = %f%n",xx,op,yy,op.apply(xx,yy));
        }*/
    }
}
