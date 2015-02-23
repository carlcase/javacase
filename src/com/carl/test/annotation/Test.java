package com.carl.test.annotation;

/**
 * Created by Carl on 15-2-4.
 */
public class Test {
    @UseCase(id=10,desc = "Hi..carl")
    public void test1(){
        System.out.println("....哈哈哈");
    }
    @UseCase(id=23,desc = "Hi..hey..")
    public void test2(){

    }
    @UseCase(id=24)
    public void test3(){

    }

    public static void main(String[] args){
        Test t = new Test();
        t.test1();
    }
}
