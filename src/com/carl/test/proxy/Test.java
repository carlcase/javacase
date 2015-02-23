package com.carl.test.proxy;

/**
 * Created by Carl on 14-12-30.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
/**
 * 动态代理类
 * Proxy
 * InvocationHandler
 */
public class Test {

    public static void main(String[] args) {
        final List list = new ArrayList();

        List list2 = (List) Proxy.newProxyInstance
                (list.getClass().getClassLoader(),
                        list.getClass().getInterfaces(),
                        new InvocationHandler() {
                            @Override
                            public Object invoke(Object proxy, Method method, Object[] args)
                                    throws Throwable {
                                try {
                                    System.out.println(method.getName() + "开始执行...");
                                    Object rs = method.invoke(list, args);
                                    System.out.println(method.getName() + "正常结束...");
                                    return rs;
                                } catch (Exception e) {
                                    System.out.println(method.getName() + " 出异常了");
                                    throw e;
                                }

                            }
                        });

        list2.add("1");
        list2.add("2");

        System.out.println(list2.get(1));
    }
}