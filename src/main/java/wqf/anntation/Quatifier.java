package wqf.anntation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)//反射
@Documented //javadoc
public @interface Quatifier {
    String value() default "";
}
