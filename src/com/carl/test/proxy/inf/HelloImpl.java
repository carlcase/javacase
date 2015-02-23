package com.carl.test.proxy.inf;

/**
 * Created by Carl on 14-12-30.
 */
public class HelloImpl implements Hello,Hello2{
    @Override
    public void sayHello(String to) {
        System.out.println("Hello to "+to);
        System.out.println(new Throwable().getStackTrace()[0]);
        //throw new RuntimeException(methodName+",抛出运行时异常...");
    }

    @Override
    public void print(String to) {
        System.out.println("print:"+to);
        //throw new RuntimeException("抛出运行时异常...");
    }

    public void say(String name){
        System.out.println(name+"say....");
    }

}
