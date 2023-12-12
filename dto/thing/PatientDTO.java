package com.xworkz.dto.thing;

public class PatientDTO {
    private String name;
    private String disease;
    private int age;
    private String bloodGroup;
    private long contactNo;
    private boolean bloodSugar;
    private boolean bloodPreasure;
    private int Weight;
    private double hight;

    public PatientDTO(){

    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public PatientDTO(String name, String disease, int age, String bloodGroup,
                      long contactNo, boolean bloodSugar, boolean bloodPreasure,
                      int weight, double hight) {
        this.name = name;
        this.disease = disease;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.contactNo = contactNo;
        this.bloodSugar = bloodSugar;
        this.bloodPreasure = bloodPreasure;
        this.Weight = weight;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "name='" + name + '\'' +
                ", Disease='" + disease + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", contactNo=" + contactNo +
                ", bloodSugar=" + bloodSugar +
                ", bloodPreasure=" + bloodPreasure +
                ", Weight=" + Weight +
                ", hight=" + hight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
       PatientDTO leftRef=this;
       if(obj!=null){
           if(obj instanceof PatientDTO){
               PatientDTO rightRef=(PatientDTO) obj;
              if(leftRef.name.equals(rightRef.name)&& leftRef.disease.equals(rightRef.disease)&& leftRef.bloodGroup.equals(rightRef.bloodGroup));
               System.out.println("both patients are same");
                return true;
           }
           else{
               System.out.println("both patients are different");
           }
       }
       return false;
    }
}

