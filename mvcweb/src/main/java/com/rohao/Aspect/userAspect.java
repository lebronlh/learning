package com.rohao.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class userAspect {
    @Pointcut("execution(* com.rohao.service.UserService.save()))")
    public void aspect(){}

    /*@Before("aspect()")
    public void before(JoinPoint joinPoint){
        log.info("before通知"+joinPoint);
    }

    @After("aspect()")
    public void after(JoinPoint joinPoint){
        log.info("after通知"+joinPoint);
    }*/

    //环绕通知
    @Around("aspect()")
    public void around(JoinPoint joinPoint){
        long start = System.currentTimeMillis();
        try {
            ((ProceedingJoinPoint)joinPoint).proceed();
            long end = System.currentTimeMillis();
            log.info("around通知"+joinPoint.getSignature().getName()+(end-start)+"ms");
        } catch (Throwable throwable) {
            long end = System.currentTimeMillis();
            log.info("around通知"+joinPoint+(end-start)+"ms");
        }
    }


    @AfterReturning("aspect()")
    public void afterReturn(JoinPoint joinPoint){
        log.info("配置返回通知");
    }

    @AfterThrowing(value = "aspect()",throwing = "ex")
    public void afterThrow(JoinPoint joinPoint,Exception ex){
        log.info("异常通知"+joinPoint+ex.getMessage());
    }



}
