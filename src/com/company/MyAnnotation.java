package com.company;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Emil on 2016-12-27.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String zwierze() default "N/A";


}
