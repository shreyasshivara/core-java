package com.xworkz.dto.thing;

public class HospitalDTO {


    private String name;
    private String location;
    private String speciality;
    private int noOfStaffs;
    private long phoneNo;
    private boolean govt;
    private int noOfBeds;
    private int noOfSpecialWards;
    private int noOfGeneralWards;

    HospitalDTO() {

    }

    //actuaters
    public String getName() {
        return name;
    }

    //mutator
    public void setName(String name) {
        this.name = name;
    }

    public HospitalDTO(String name, String location, String speciality,
                       int noOfStaffs, long phoneNo, boolean govt, int noOfBeds,
                       int noOfSpecialWards, int noOfGeneralWards) {
        this.name = name;
        this.location = location;
        this.speciality = speciality;
        this.noOfStaffs = noOfStaffs;
        this.phoneNo = phoneNo;
        this.govt = govt;
        this.noOfBeds = noOfBeds;
        this.noOfSpecialWards = noOfSpecialWards;
        this.noOfGeneralWards = noOfGeneralWards;
    }

    @Override
    public String toString() {
        return "HospitalDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", Speciality='" + speciality + '\'' +
                ", noOfStaffs=" + noOfStaffs +
                ", phoneNo=" + phoneNo +
                ", govt=" + govt +
                ", noOfBeds=" + noOfBeds +
                ", noOfSpecialWards=" + noOfSpecialWards +
                ", noOfGeneralWards=" + noOfGeneralWards +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        HospitalDTO leftRef = this;
        if (obj != null) {
            if (obj instanceof HospitalDTO) {
                HospitalDTO rightRef = (HospitalDTO) obj;
                if (leftRef.name.equals(rightRef.name) && leftRef.speciality.equals(rightRef.speciality)) {
                    System.out.println("both the hospitals are same");
                    return true;
                } else {
                    System.out.println("both the hospitals are different");
                }
            }


        }

        return false;
    }
}




