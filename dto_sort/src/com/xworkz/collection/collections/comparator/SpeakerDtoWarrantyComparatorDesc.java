package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerDtoWarrantyComparatorDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return o2.getWarranty().compareTo(o1.getWarranty());
    }
}
