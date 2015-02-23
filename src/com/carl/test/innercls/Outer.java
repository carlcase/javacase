package com.carl.test.innercls;

/**
 * Created by Administrator on 14-12-24.
 */
public class Outer {
    class Inner{
        Inner(){
            System.out.println("Create Inner Object");
        }
    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String [] args){
        //Inner i = new Inner();
        Outer.Inner i = new Outer().getInner();
    }
}
