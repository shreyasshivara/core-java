package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.BeltDTO;

import java.util.Comparator;

public class BeltDtoBrandComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
class BeltDtoBrandComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
class BeltDtoColourComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}
class BeltDtoColourComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o2.getColour().compareTo(o1.getColour());
    }
}
class BeltDtoMaterialComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o1.getMaterial().compareTo(o2.getMaterial());
    }
}
class BeltDtoMaterialComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return o2.getMaterial().compareTo(o1.getMaterial());
    }
}
class BeltDtoCostComparatorAsc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class BeltDtoCostComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}


