package wqf.anntation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)//反射
@Documented //javadoc
public @interface RequestMapping {
    String value() default "";
}
