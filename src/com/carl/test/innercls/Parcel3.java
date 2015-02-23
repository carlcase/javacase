package com.carl.test.innercls;

/**
 * Created by Carl on 14-12-24.
 */
public class Parcel3 {
    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    class Destination/*目的地*/{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String [] args){
        Parcel2 p = new Parcel2();
        p.ship("carl");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.new Contents();
        Parcel2.Destination d = q.new Destination("哈哈哈");
        System.out.println(d.readLabel());
    }
}
