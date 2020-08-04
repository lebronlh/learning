package effectivejava.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("effectivejava.annotation.Sample2");
        for (Method m:testClass.getDeclaredMethods()){
            if(m.isAnnotationPresent(ExceptionTest.class))
                tests++;
            try {
                m.invoke(null);
                System.out.printf("Test %s failed: no exception%n",m);
            } catch (InvocationTargetException e) {
                Throwable exc = e.getCause();
                Class<? extends Throwable> value = m.getAnnotation(ExceptionTest.class).value();
                if (value.isInstance(exc))
                    passed++;
                else {
                    System.out.printf("Test %s failed:expected %s,got %s%n", m, value.getName(), exc);
                }
            }
               catch (Exception e) {
                   System.out.println("invalid @Test:"+m);;
            }
        }
    }
}
