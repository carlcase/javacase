package com.carl.test.innercls;

/**
 * Created by Carl on 14-12-24.
 */
public class DotNew {
    public class Inner{}
    public static void main(String [] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
