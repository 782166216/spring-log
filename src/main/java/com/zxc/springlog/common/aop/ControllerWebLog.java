package com.zxc.springlog.common.aop;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    String name();//调用接口名称
    boolean intoDb() default false;//标识该条操作日志是否需要持久化存储
}
