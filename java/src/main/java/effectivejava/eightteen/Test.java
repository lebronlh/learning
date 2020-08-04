package effectivejava.eightteen;

import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        InstrumentedSet<String> in = new InstrumentedSet(new HashSet());
        in.addAll(List.of("avc","dsf","fdggsfd"));
        System.out.println(in.getAddCount());
    }
}
