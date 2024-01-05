package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Radio {
    public static void main(String[] args) {
        Collection<Float> radio=new ArrayList<>();
        radio.add(93.5f);
        radio.add(92.7f);
        radio.add(91.1f);
        radio.add(89.3f);
        radio.add(102.0f);
        radio.add(121.4f);
       /* Collection<Integer> radio1=new ArrayList<>();
        radio1.add(123);*/
        Iterator<Float> ref=radio.iterator();
        while(ref.hasNext()){

           Float ok= ref.next();
            if(ok>90){
                System.out.println(ok);
            }
            //System.out.println("radio station:"+ ok);
        }

    }

}
