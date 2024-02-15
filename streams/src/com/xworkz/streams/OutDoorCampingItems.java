package com.xworkz.streams;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@ToString
public class OutDoorCampingItems {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tent");
        list.add("Back Pack");
        list.add("Hat");
        list.add("Camera");
        list.add("Waist bag");
        list.add("Camp chair");
        list.add("Sleeping bag");
        list.add("Camping stove");
        list.add("Camping Table");
        list.add("First aid kit");
        System.out.println("printing list of containing T");
        list.stream().filter(f-> f.contains("t")).forEach(f-> System.out.println(f));
        System.out.println("printing sorted list in desc");
        list.stream().sorted(Collections.reverseOrder()).forEach(f-> System.out.println(f));
        System.out.println("printing list lenght <5");
        list.stream().filter(f->f.length()<5).sorted(Collections.reverseOrder()).forEach(f-> System.out.println(f));
        System.out.println("Converting all list to UPPER case and filtering list which has A");
        list.forEach(r-> System.out.println(r.toUpperCase()));
        list.stream().filter(f->f.contains("a")).forEach(f-> System.out.println(f));
        System.out.println("counting list which has t in the list");
long count=list.stream().filter(l->l.contains("t")).count();
        System.out.println(count);
        List<String> aAndo=list.stream().filter(f->f.contains("a")&&f.contains("o")).collect(Collectors.toList());
        System.out.println(aAndo);
        aAndo.stream().sorted().forEach(f->System.out.println(f));

    }
}
