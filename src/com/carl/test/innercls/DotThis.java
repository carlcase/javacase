package com.carl.test.innercls;

/**
 * Created by Carl on 14-12-24.
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()..");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String [] args){
        DotThis dt = new DotThis();
        DotThis.Inner inner = dt.inner();
        inner.outer().f();
    }
}
