class Owner{
	
	String name="Shreyas";
	String email;//set
	String permanentAdress;//ref
	String temporaryAdress;//const
	
	Owner(String temporaryAdress){
		this.temporaryAdress=temporaryAdress;
		System.out.println("Created Owner using temporaryAdress");
	}
	void setEmail(String email){
		this.email=email;
	}
	void permanentAdress(String permanentAdress){
		this.permanentAdress=permanentAdress;
	}
	void Show(){
		System.out.println("Starting show in Owner");
		System.out.println("The name is :"+ this.name);
		System.out.println("The email is :"+ this.email);
		System.out.println("The permanentAdress is :"+ this.permanentAdress);
		System.out.println("The temporaryAdress is :"+ this.temporaryAdress);
		System.out.println("Ending show in Owner");
	}
	
	
	
	
}