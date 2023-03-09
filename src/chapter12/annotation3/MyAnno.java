package chapter12.annotation3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}
