package com.carl.test.innercls;

/**
 * Created by Carl on 14-12-24.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length)
                i++;
        }
    }

    class TestStr{
        String str = "Test String..";

        @Override
        public String toString() {
            return "TestStr{" +
                    "str='" + str + '\'' +
                    '}';
        }
    }

    public TestStr testStr(){
        return new TestStr();
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    /*public static void main(String [] args){
        Sequence sequence = new Sequence(10);
        for(int i=0;i<10;i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current()+" ");
            selector.next();
        }
    }*/

    public static void main(String [] args){
        Sequence sequence = new Sequence(2);
        TestStr item1 = sequence.testStr();
        TestStr item2 = sequence.testStr();
        sequence.add(item1);
        sequence.add(item2);
        Selector selector = sequence.selector();
        int count = 0;
        while(!selector.end()){
            System.out.print(selector.current()+" "+count++);
            selector.next();
        }
    }
}

