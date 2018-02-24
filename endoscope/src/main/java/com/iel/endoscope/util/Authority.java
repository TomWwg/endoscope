package com.iel.endoscope.util;

import java.lang.annotation.*;

/**
 * 自定义注解类
 * @author wwg
 * @date 2018/2/24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Authority {

    //默认验证
    AuthorityType value() default AuthorityType.Validate;
}
