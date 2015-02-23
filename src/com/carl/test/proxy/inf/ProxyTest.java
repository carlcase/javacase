package com.carl.test.proxy.inf;

import java.lang.reflect.Proxy;

/**
 * Created by Carl on 14-12-30.
 */
public class ProxyTest {
    public static void main(String [] args){
        HelloImpl impl = new HelloImpl();
        LogHandler handler = new LogHandler(impl);
        Hello hello = (Hello) Proxy.newProxyInstance(impl.getClass().getClassLoader(), impl.getClass().getInterfaces(), handler);
        hello.sayHello("Carl");
        hello.print("哈哈哈哈");
        impl.say("carl");

    }
}
