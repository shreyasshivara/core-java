package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospital {
    public static void main(String[] args) {
        Collection<String>name=new ArrayList<>();
        name.add("jaydeva");
        name.add("apollo");
        name.add("baptist");
        name.add("nimhans");
        name.add("st.joseph");
        name.add("kidwai");
        name.add("jss");
        name.add("bgs");
        name.add("kims");
        name.add("hims");
        name.add("mims");
        name.add("govt");
        name.add("ayurvedha ");
        name.add("dharmasthala");
        name.add("trinity");
        name.add("kanva");
        name.add("mission");
        name.add("victoria");
        name.add("ssm");
        name.add("mangala");
        Iterator<String> itr=name.iterator();
        while(itr.hasNext()){
            String ref= itr.next();
            if(ref.endsWith("o")|| ref.endsWith("O")){
                System.out.println("hospital:"+ref);

            }
        }
    }
}
