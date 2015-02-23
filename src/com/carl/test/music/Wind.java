package com.carl.test.music;

/**
 * Created by Administrator on 14-12-22.
 */
public class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind.play().."+n);
    }
}
