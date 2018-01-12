package com.bullyun.annotation;

import java.lang.annotation.*;

/**
 * @author lanhuidong
 * @since 2017-03-21
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Stream {

    String name() default "";
}
