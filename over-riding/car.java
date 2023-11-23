class Car{
	CarWheel wheel;//const
	int topSpeed;
	String brand;
	int noOfSeating;
	int enginecc;//ref
	boolean turbo;
	String type;
	CarFuel fuel;//set
	int driveWheel;
	String colour;
	
	Car(){
		
	}
	Car(CarWheel wheel,int topSpeed,String brand,int noOfSeating){
		
	}
	void setFuel(CarFuel fuel,int driveWheel,String colour){
		System.out.println("fuel:"+ fuel);
		System.out.println("Drive wheels:"+ driveWheel);
		System.out.println("colour :" + colour);
		
	}
	void transportation(){
		System.out.println("running transportation");
	}
	void personalMobility(){
		System.out.println("running personalMobility");
	}
	void cargoHauling(){
		System.out.println("running cargoHauling");
	}
	void emergencyResponse(){
		System.out.println("running emergencyResponse");
	}
	void leisureAndRecreation(){
		 System.out.println("running leisureAndRecreation");
	}
	void economicActivity(){
		System.out.println("running economicActivity");
	}
	void culturalSymbol(){
		System.out.println("running culturalSymbol");
	}
	void technologicalAdvancement(){
		System.out.println("running technologicalAdvancement");
	}
	void environmentalImpact(){
		System.out.println("running environmentalImpact");
	}
	void socialImplications(){
		System.out.println("running socialImplications");
	}
	
	
	
	
} 