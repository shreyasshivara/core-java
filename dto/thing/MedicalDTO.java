package com.xworkz.dto.thing;

public class MedicalDTO {
    private String name;
    private String location;
    private String timings;
    private String owner;
    private long contactNo;
    private String incharge;
    private boolean isOpen;
    private int noOfStaffs;
    private double rating;
    private int noOfBranches;

    public String getName(){
      return name;
    }
    public void setName(){
        this.name=name;
    }
    public MedicalDTO(){

    }

    public MedicalDTO(String name, String location, String timings, String owner, long contactNo,
                      String incharge, boolean isOpen, int noOfStaffs, double rating,
                      int noOfBranches) {
        this.name = name;
        this.location = location;
        this.timings = timings;
        this.owner = owner;
        this.contactNo = contactNo;
        this.incharge = incharge;
        this.isOpen = isOpen;
        this.noOfStaffs = noOfStaffs;
        this.rating = rating;
        this.noOfBranches = noOfBranches;
    }

    @Override
    public String toString() {
        return "MedicalDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", timings='" + timings + '\'' +
                ", owner='" + owner + '\'' +
                ", contactNo=" + contactNo +
                ", incharge='" + incharge + '\'' +
                ", isOpen=" + isOpen +
                ", noOfStaffs=" + noOfStaffs +
                ", rating=" + rating +
                ", noOfBranches=" + noOfBranches +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        MedicalDTO leftRef=this;
        if(obj!=null){
            if(obj instanceof MedicalDTO){
                MedicalDTO rightRef=(MedicalDTO) obj;
                if(leftRef.name.equals(rightRef.name)&& leftRef.contactNo==rightRef.contactNo) {

                    System.out.println("both the medicals are same");
                    return true;
                }
                else{
                    System.out.println("both the medicals are different");
                }

            }
        }else {
            System.out.println("passing null");
        }
        return false;
    }

}
