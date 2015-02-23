package com.carl.test.proxy.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Carl on 15-1-5.
 */
@Component
@Aspect
public class LogerAsc {

    @Around("within(com.carl.test.proxy.spring.test.Hello*)")//直接指定表达式
    public Object log(ProceedingJoinPoint pjp) throws Throwable{
        //获取当前请求要执行的Action目标组件类型
        String className = pjp.getTarget().getClass().getName();
        //获取当前请求要执行的方法名
        String methodName =
                pjp.getSignature().getName();
        //解析opt.properties，根据className.methodName获取操作提示信息
        String key = className+"."+methodName;

        Object obj = null;
        try{
            System.out.println("carl在"+new Date()+"时间开始执行了"+key+"操作");
            obj = pjp.proceed();//执行目标组件方法处理
            System.out.println("Carl在"+new Date()+"时间结束了"+key+"操作");
        }catch(Exception e){
            System.out.println("Carl在"+new Date()+"时间执行方法出错了"+key+"操作");
        }
        return obj;//将proceed目标方法结果返回
    }
}
