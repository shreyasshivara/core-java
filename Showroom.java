class Showroom{
	
	String name;
	String location;
	double ratings;
	String brand;
	int startedYear;
	long contactNo;
	boolean service;
	int noOfStaffs;
	
	Showroom()
	{
		System.out.println("Showroom created");
	}
	Showroom(String name)
	{
		this.name=name;
	}
	Showroom(String name, String location)
	{
		this.name=name;
		this.location=location;
	}
	Showroom(String name, String location,double ratings)
	{
		this.name=name;
		this.location=location;
		this.ratings=ratings;
	}
	Showroom(String name, String location,double ratings, String brand)
	{
		this.name=name;
		this.location=location;
		this.ratings=ratings;
		this.brand=brand;
	}
	Showroom(String name, String location,double ratings, String brand,int startedYear)
	{
		this.name=name;
		this.location=location;
		this.ratings=ratings;
		this.brand=brand;
		this.startedYear=startedYear;
	}
	Showroom(String name, String location,double ratings, String brand,int startedYear,long contactNo)
	{
		this.name=name;
		this.location=location;
		this.ratings=ratings;
		this.brand=brand;
		this.startedYear=startedYear;
		this.contactNo=contactNo;
	}
	Showroom(String name, String location,double ratings, String brand,int startedYear,long contactNo,boolean service)
	{
		this.name=name;
		this.location=location;
		this.ratings=ratings;
		this.brand=brand;
		this.startedYear=startedYear;
		this.contactNo=contactNo;
		this.service=service;
	}
	Showroom(String name, String location,double ratings, String brand,int startedYear,long contactNo,boolean service,int noOfStaffs)
	{
		this.name=name;
		this.location=location;
		this.ratings=ratings;
		this.brand=brand;
		this.startedYear=startedYear;
		this.contactNo=contactNo;
		this.service=service;
		this.noOfStaffs=noOfStaffs;
	}
	
	
	
	
}