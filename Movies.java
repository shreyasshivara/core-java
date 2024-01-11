package com.xworkz.collections;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Movies {
    public static void main(String[] args) {
        Collection<String> movies =new ArrayList<>();
        Collection<String>DMovies=new ArrayList<>();
        DMovies.add("Kaatera");
        DMovies.add("kranthi");

        movies.add("Kaatera");
        movies.add("kranthi");
        movies.add("kantara");
        movies.add("leo");
        movies.add("jailer");
        movies.add("pushpa");
        movies.add("navagraha");
        movies.add("mejestic");
        movies.add("kariya");
        movies.add("charlee");
        movies.add("rajkumara");
        movies.add("D56");
        movies.add("james");
        //movies.clear();
        //movies.removeAll(movies);
        System.out.println("total movies after add:"+movies.size());
        System.out.println(movies.remove("james"));
        System.out.println("movies after 1 remove:"+movies.size());
        System.out.println("is empty:"+movies.isEmpty());
        System.out.println(movies.contains("kranthi"));
        System.out.println(movies.containsAll(DMovies));
        System.out.println(movies.equals(DMovies));
//movies.addAll(DMovies);
        Iterator<String>itr=movies.iterator();
        while(itr.hasNext()){
            String ref=itr.next();
            System.out.println(ref);

        }


    }
}
