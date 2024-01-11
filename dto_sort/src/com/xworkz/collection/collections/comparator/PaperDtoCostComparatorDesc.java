package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.PaperDTO;

import java.util.Comparator;

public class PaperDtoCostComparatorDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o2.getCost(),o1.getCost());
    }
}
