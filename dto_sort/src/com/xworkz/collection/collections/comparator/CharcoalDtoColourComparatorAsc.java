package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.CharcoalDTO;

import java.util.Comparator;

public class CharcoalDtoColourComparatorAsc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}
class CharcoalDtoColourComparatorDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return o2.getColour().compareTo(o1.getColour());
    }
}
class CharcoalDtoTypeComparatorDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
class CharcoalDtoTypeComparatorAsc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
class CharcoalDtoCostComparatorAsc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getCostPerKg(), o2.getCostPerKg());
    }
}
class CharcoalDtoCostComparatorDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o2.getCostPerKg(), o1.getCostPerKg());
    }
}
class CharcoalDtoQuantityComparatorAsc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class CharcoalDtoQuantityComparatorDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
