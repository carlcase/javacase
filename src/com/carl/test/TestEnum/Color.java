package com.carl.test.TestEnum;

/**
 * Created by Carl on 15-1-13.
 */
public enum Color {
    RED("红色",1),GREEN("绿色",2),BLACK("黑色",3),YELLOW("黄色",4);
    //将enum当成常量来使用
    private String name;
    private int code;

    private Color(String name,int code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static String getName(int code){
        for(Color c:Color.values()){
            if(c.getCode() == code){
                return c.getName();
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
