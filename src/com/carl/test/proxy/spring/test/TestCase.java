package com.carl.test.proxy.spring.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Carl on 15-1-5.
 */
public class TestCase {
    @Test
    public void test1(){
        //实例化Spring容器对象
        String conf = "/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        Hello hello = (Hello) ac.getBean("hello");
        hello.sayHi();
        //hello.hi();
    }

}
