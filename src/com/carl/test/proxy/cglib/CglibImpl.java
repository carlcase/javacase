package com.carl.test.proxy.cglib;

/**
 * Created by Carl on 14-12-30.
 */
public class CglibImpl{

    private String test;
    private int age;

    public CglibImpl(String test,int age) {
        this.test = test;
        this.age = age;
    }

    public CglibImpl() {
    }


    public void option(){
        System.out.println("test:"+test);
        System.out.println("age:"+23);
        add("carl");
        System.out.println(new Throwable().getStackTrace()[0]);
        System.out.println(new Throwable().getStackTrace()[1]);
        //throw new RuntimeException("运行时异常");
        delete("DAHUA");
        CglibImpl2 impl2 = new CglibImpl2();
        CglibProxy proxy = new CglibProxy();
        CglibImpl2 impl = (CglibImpl2) proxy.getInstance(impl2);
        impl.test("carl");
    }

    public void add(String optionName){
        System.out.println("Add by "+optionName);
        //throw new RuntimeException("运行时异常");
    }

    public void delete(String optionName){
        System.out.println("Delete by "+optionName);
    }
}
