package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.RefillDto;

import java.util.Comparator;

public class RefillDtoColourComparatorAsc implements Comparator<RefillDto> {

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}
class RefillDtoColourComparatorDesc implements Comparator<RefillDto>{

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return o2.getColour().compareTo(o1.getColour());
    }
}
class RefillDtoCostComparatorDesc implements Comparator<RefillDto>{

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class RefillDtoCostComparatorAsc implements Comparator<RefillDto>{

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class RefillDtoBrandComparatorAsc implements Comparator<RefillDto>{

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
class RefillDtoBrandComparatorDesc implements Comparator<RefillDto>{

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
class RefillDtoReusableComparatorAsc implements Comparator<RefillDto>{

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return Boolean.compare(o1.isReusable(),o2.isReusable());
    }
}
class RefillDtoReusableComparatorDesc implements Comparator<RefillDto>{

    @Override
    public int compare(RefillDto o1, RefillDto o2) {
        return Boolean.compare(o2.isReusable(),o1.isReusable());
    }
}
