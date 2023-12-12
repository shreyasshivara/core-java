package com.xworkz.dto.thing;

public class Nurse{
    private String name;
    private int age;
    private long contactNo;
    private int workExp;
    private String workingIn;
    private double salary;
    private boolean isGovtEmployee;
    private String workingAs;
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public Nurse(){

    }

    public Nurse(String name, int age, long contactNo, int workExp, String workingIn,
                 double salary, boolean isGovtEmployee, String workingAs) {
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
        this.workExp = workExp;
        this.workingIn = workingIn;
        this.salary = salary;
        this.isGovtEmployee = isGovtEmployee;
        this.workingAs = workingAs;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contactNo=" + contactNo +
                ", workExp=" + workExp +
                ", workingIn='" + workingIn + '\'' +
                ", salary=" + salary +
                ", isGovtEmployee=" + isGovtEmployee +
                ", workingAs='" + workingAs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
    Nurse leftRef=this;
    if(obj!=null)
    if(obj instanceof  Nurse){
        Nurse rightRef=(Nurse)obj;
        if(leftRef.name.equals(rightRef.name)  && leftRef.workingAs.equals(rightRef.workingAs)) {
            System.out.println("both the nurse are same");
            return true;
        }
        else{
            System.out.println("both the nurse are different");
        }
    }

    return false;
    }
}
