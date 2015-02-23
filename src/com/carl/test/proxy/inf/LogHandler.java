package com.carl.test.proxy.inf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Carl on 14-12-30.
 */
public class LogHandler implements InvocationHandler {

    private Object dele;

    public LogHandler(Object dele) {
        this.dele = dele;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try{
            doBefore();
            result = method.invoke(dele,args);
            doAfter();
        }catch(Exception e){
            doError();
        }
        return result;
    }

    private void doBefore(){
        System.out.println("before.....");
    }

    private void doAfter(){
        System.out.println("After...");
    }

    private void doError(){
        System.out.println("Error...");
    }
}
