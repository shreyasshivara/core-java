package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerDtoBrandComparatorAsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
