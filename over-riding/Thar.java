class Thar extends Car1{
	
	double cost;//ref
	String colour;//const
	
	Thar(){
		
	}
	Thar(String colour){
		System.out.println("the colour is :"+ colour);
	}
	Thar(CarWheel wheel,int topSpeed,String brand,int noOfSeating){
		System.out.println("drive weels are:"+ wheel);
		System.out.println("topspeed:"+ topSpeed +"kmph");
		System.out.println("Brand :"+ brand);
		System.out.println("seats:"+ noOfSeating);
		
		
	}
	void offRoading(){
		System.out.println("Running off-roading in Thar");
	}
	void dailyCommuter(){
		System.out.println("Running dailyCommuter in Thar");
	}
	void adventureCompanion(){
		System.out.println("Running adventureCompanion in Thar");
	}
	void lifestyleStatement(){
		System.out.println("Running lifestyleStatement in Thar");
	}
	void transportation(){
	System.out.println("running transportation in Thar");
	}
	void personalMobility (){
		System.out.println("running personalMobility in Thar");
	}
	void cargoHauling(){
		System.out.println("running cargoHauling in Thar");
	}
	void emergencyResponse(){
		System.out.println("running emergencyResponse in Thar");
	
	
	
	}
	
	
	
}