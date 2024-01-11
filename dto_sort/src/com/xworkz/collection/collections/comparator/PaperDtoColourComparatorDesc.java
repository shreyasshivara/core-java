package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.PaperDTO;

import java.util.Comparator;

public class PaperDtoColourComparatorDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return o2.getColour().compareTo(o1.getColour());
    }
}
