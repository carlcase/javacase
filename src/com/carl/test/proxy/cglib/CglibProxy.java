package com.carl.test.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * Created by Carl on 14-12-30.
 */
public class CglibProxy implements MethodInterceptor{
    /**
     * 创建代理对象
     *
     * @param target        代理对象
     * @param args          对应的构造器参数类型
     *
     *                          例：有构造器如下
     *                          public Person(name,age){...} name为String.class age为int.class
     *                          写入name的类型与age的类型
     *
     *                          则：new Class[]{String.class,int.class}
     *
     * @param argsValue     对应的构造器参数值
     *
     *                          例:如此创建对象 new Person("name",23) 用以下方式传入：new Object[]{"name",23}
     *
     * @param <T>           <泛型方法>
     * @return              返回跟代理对象类型
     */
    public <T> T getInstance(T target,Class[] args,Object[] argsValue){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create(args,argsValue);
    }

    /**
     * 创建代理对象
     *
     * @param target        代理对象
     * @param <T>           <泛型方法>
     * @return              返回跟代理对象类型
     */
    public <T> T getInstance(T target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try{
            //调用方法前执行的方法修改此处即可
            System.out.println("Before "+method.getName()+" ..");
            //调用实现类中的方法
            result = methodProxy.invokeSuper(o,objects);
            //调用方法后执行的方法修改此处即可
            System.out.println("End "+method.getName()+" ..");
        }catch(Exception e){
            //调用方法出错时执行的方法修改此处即可
            System.out.println("Errod "+method.getName()+" ..");
        }
        return result;
    }
}
