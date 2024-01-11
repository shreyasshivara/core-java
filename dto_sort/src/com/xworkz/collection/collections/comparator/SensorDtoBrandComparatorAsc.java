package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.SensorDTO;

import java.util.Comparator;

public class SensorDtoBrandComparatorAsc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
class SensorDtoBrandComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
class SensorDtoCostComparatorAsc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class SensorDtoCostComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class SensorDtoTypeComparatorAsc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
class SensorDtoTypeComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return o2.getType().compareTo(o1.getType());
    }
}
class SensorDtoDistanceComparatorAsc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o1.getDistenceInMtr(), o2.getDistenceInMtr());
    }
}
class SensorDtoDistanceComparatorDesc implements Comparator<SensorDTO> {
    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o2.getDistenceInMtr(), o1.getDistenceInMtr());
    }
}
