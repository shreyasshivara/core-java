package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.ParkingDTO;

import java.util.Comparator;

public class ParkingDtoTypeComparatorAsc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
class ParkingDtoTypeComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
class ParkingDtoCostComparatorAsc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}
class ParkingDtoCostComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o2.getCost(),o1.getCost());
    }
}
class ParkingDtoIs_Any_ChargesComparatorAsc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Boolean.compare(o1.is_any_charges(),o2.is_any_charges());
    }
}
class ParkingDtoIs_Any_ChargesComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Boolean.compare(o2.is_any_charges(),o1.is_any_charges());
    }
}
class ParkingDtoLocationComparatorAsc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o1.getLocation().compareTo(o2.getLocation());
    }
}
class ParkingDtoLocationComparatorDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return o2.getLocation().compareTo(o1.getLocation());
    }
}
