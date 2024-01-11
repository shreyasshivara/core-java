package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.PaperDTO;

import java.util.Comparator;

public class PaperDtoBrandComparatorDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
