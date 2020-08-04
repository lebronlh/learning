package effectivejava.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//在运行时也应该存在
@Target(ElementType.METHOD)//只有在方法声明中才合法
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}

