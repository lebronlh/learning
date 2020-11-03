package effectivejava.eightteen;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        InstrumentedSet<String> in = new InstrumentedSet(new HashSet());
        System.out.println(in.getAddCount());
    }
}
