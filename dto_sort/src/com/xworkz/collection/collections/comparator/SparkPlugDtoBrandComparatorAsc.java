package com.xworkz.collection.collections.comparator;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xworkz.collection.collections.dto.SparkPlugDto;

import java.util.Comparator;

public class SparkPlugDtoBrandComparatorAsc implements Comparator<SparkPlugDto>{
    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
class SparkPlugDtoBrandComparatorDesc implements Comparator<SparkPlugDto>{
    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
class SparkPlugDtoColourComparatorAsc implements Comparator<SparkPlugDto>{
    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}
class SparkPlugDtoColourComparatorDesc implements Comparator<SparkPlugDto>{
    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return o2.getColour().compareTo(o1.getColour());
    }
}
class SparkPlugDtoUsedforComparatorAsc implements Comparator<SparkPlugDto> {
    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return o1.getUsedFor().compareTo(o2.getUsedFor());
    }

}
class SparkPlugDtoUsedforComparatorDesc implements Comparator<SparkPlugDto> {
    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return o2.getUsedFor().compareTo(o1.getUsedFor());
    }

}
class SparkPlugDtoCostComparatorAsc implements Comparator<SparkPlugDto>{

    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class SparkPlugDtoCostComparatorDesc implements Comparator<SparkPlugDto> {

    @Override
    public int compare(SparkPlugDto o1, SparkPlugDto o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}

