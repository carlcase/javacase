package com.carl.test.innercls;

/**
 * Created by Administrator on 14-12-24.
 */
public class Parcel1/*包,邮包*/ {
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

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String [] args){
        Parcel1 p = new Parcel1();
        p.ship("Carl");
    }
}
