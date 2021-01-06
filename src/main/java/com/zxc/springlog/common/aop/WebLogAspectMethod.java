package com.zxc.springlog.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(300)
public class WebLogAspectMethod {
    private static final Logger logger = LoggerFactory.getLogger(WebLogAspectMethod.class);

    @Pointcut("execution( * com.zxc.springlog.controller..*.get*(..))")
    public void showLog(){
    }

    @Before(value = "showLog() && @annotation(controllerWebLog)")
    public void doBefore(JoinPoint joinPoint, ControllerWebLog controllerWebLog){
        logger.info("====基于方法的切面(前置)====");
        logger.info("执行方法：" + controllerWebLog.name());
    }
    @After(value = "showLog() && @annotation(controllerWebLog)")
    public void doAfter(JoinPoint joinPoint, ControllerWebLog controllerWebLog){
        logger.info("====基于方法的切面(后置)====");
        logger.info("执行方法：" + controllerWebLog.name());
    }
}
