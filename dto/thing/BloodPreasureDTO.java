package com.xworkz.dto.thing;

public class BloodPreasureDTO {
    private String patientName;
    private int bp;
    private int pulseRate;
    private long PatientContactNo;
    private double Timings;
    private double PatientWeight;
    private int PatientAge;
    private String clinicName;
    private String doctorName;

    public String getClinicName() {
        return clinicName;
    }
    public void setPatientName(){
        this.patientName=patientName;
    }
    public BloodPreasureDTO(){

    }

    public BloodPreasureDTO(String patientName, int bp, int pulseRate, long patientContactNo,
                            double timings, double patientWeight, int patientAge,
                            String clinicName, String doctorName) {
        this.patientName = patientName;
        this.bp = bp;
        this.pulseRate = pulseRate;
        PatientContactNo = patientContactNo;
        Timings = timings;
        PatientWeight = patientWeight;
        PatientAge = patientAge;
        this.clinicName = clinicName;
        this.doctorName = doctorName;
    }


    @Override
    public String toString() {
        return "BloodPreasureDTO{" +
                "patientName='" + patientName + '\'' +
                ", bp=" + bp +
                ", pulseRate=" + pulseRate +
                ", PatientContactNo=" + PatientContactNo +
                ", Timings=" + Timings +
                ", PatientWeight=" + PatientWeight +
                ", PatientAge=" + PatientAge +
                ", clinicName='" + clinicName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        BloodPreasureDTO leftRef=this;
        if(obj!=null){
            if (obj instanceof BloodPreasureDTO){
                BloodPreasureDTO rightRef=(BloodPreasureDTO) obj;
                if(leftRef.patientName.equals(rightRef.patientName)&& leftRef.PatientContactNo==rightRef.PatientContactNo){
                    System.out.println("both the bp is same");
                    return true;
                }
                else{
                    System.out.println("both the bp is different");
                }

            }
        }
        return false;
    }
}
