package com.carl.test.proxy.cglib;

/**
 * Created by Carl on 14-12-30.
 */
public class CglibTest {
    public static void main(String [] args){
        //代理类
        CglibProxy proxy = new CglibProxy();
        //通过代理类来创建真正的实现类,若需要通过构造函数传入参数则参考一下例子,若不需要传入参数则
        //将需要代理的对象传入代理类的getInstance(T obj)方法中即可

        //需要传入构造参数的代理方式
        CglibImpl impl = (CglibImpl) proxy.getInstance(new CglibImpl(),//需要代理的对象
                new Class[]{String.class,int.class},//传入对应构造函数的类型
                new Object[]{"test",23});//传入对应构造函数的值

        //不需要传入构造参数的代理方式
        //CglibImpl impl2 = (CglibImpl) proxy.getInstance(new CglibImpl());

        //通过代理的对象来调用其中的方法
        impl.option();
    }
}
