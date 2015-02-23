package com.carl.test.TestEnum;

/**
 * Created by Carl on 15-1-13.
 */

public class EnumClass {
    public static void main(String [] args){
        System.out.println("color:"+Color.RED.getCode());
        System.out.println("color:"+Color.RED.getName());
        System.out.println("Color.Name:"+Color.RED.toString());
        System.out.println("Color.Name:"+Color.getName(2));
    }
}
