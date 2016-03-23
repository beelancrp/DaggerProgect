package com.beelancrp.daggerproject.DI.supports;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by bilan on 23.03.2016.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface Lifecycle {
    String value() default "";
}