class Address{
	
	String street= "MG road";
	long pincode;//set
	City city;//const
	
	Address(City city){
		this.city=city;
		System.out.println("Created Address using City org const....");
	}
	
	void setPincode(long pincode){
		this.pincode=pincode;
	}
	void Show(){
		System.out.println("Starting Show in Adress");
		System.out.println("The street is :"+ this.street);
		System.out.println("The pincode is:"+ this.pincode);
		System.out.println("The city is:"+ this.city);
		System.out.println("Ending Show in Adress");
	}
	
}