package wqf.anntation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)//反射
@Documented //javadoc
public @interface RequestParam {
    String value() default "";
}
