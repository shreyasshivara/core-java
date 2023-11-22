class Placement{
	
	boolean placement=true;
	String name;
	double maxPackage;
	double minPackage;
	int noOfVacancy;
	int noOfPlaced;
	int noOfRounds;
	String role;
	int attended;
	String skillRequired;
	String location;
	boolean wFH= false;
	
	
	Placement(String name,double maxPackage,double minPackage,int noOfVacancy,int noOfPlaced,int noOfRounds,String role,int attended,String skillRequired,String location)
	{
	this.name=name;
	this.maxPackage=maxPackage;
	this.minPackage=minPackage;
	this.noOfVacancy=noOfVacancy;
	this.noOfPlaced=noOfPlaced;
	this.noOfRounds=noOfRounds;
	this.role=role;
	this.attended=attended;
	this.skillRequired=skillRequired;
	this.location=location;
	}
	
	
	void DisplayInfo()
	{
		System.out.println("The company name is:"+ this.name);
		System.out.println("the maximum package is:"+ this.maxPackage);
		System.out.println("The minimum package is:"+ this.minPackage);
		System.out.println("noOfVacancy:"+ this.noOfVacancy);
		System.out.println("noOfPlaced:"+ this.noOfRounds);
		System.out.println("role:"+ this.role);
		System.out.println("Attended:"+ this.attended);
		System.out.println("skillRequired:"+ this.skillRequired);
		System.out.println("location:"+ this.location);
	}
	
	
	
	
	
	
	
}