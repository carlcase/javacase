package com.carl.test.proxy;

/**
 * Created by Carl on 14-12-30.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getProxyInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class cls = Class.forName(className);
        final Object target = cls.newInstance();
        return Proxy.newProxyInstance(cls.getClassLoader(),
                cls.getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                System.out.println(method.getName() + "开始执行...");
                Object rs = method.invoke(target, args);
                System.out.println(method.getName() + "正常结束...");
                return rs;
            }
        });
    }
}