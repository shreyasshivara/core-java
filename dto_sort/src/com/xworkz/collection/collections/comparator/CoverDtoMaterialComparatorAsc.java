package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.CoverDTO;

import java.util.Comparator;

public class CoverDtoMaterialComparatorAsc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o1.getMaterial().compareTo(o2.getMaterial());
    }
}
class CoverDtoMaterialComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o2.getMaterial().compareTo(o1.getMaterial());
    }
}
class CoverDtoTypeComparatorAsc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
class CoverDtoTypeComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
class CoverDtoColourComparatorAsc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}
class CoverDtoColourComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return o2.getColour().compareTo(o1.getColour());
    }
}
class CoverDtoCostComparatorAsc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class CoverDtoCostComparatorDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
