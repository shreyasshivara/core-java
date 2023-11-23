class Thar extends Car1{
	
	double cost;//ref
	String colours;//const
	
	Thar(){
		
	}
	
	Thar(String colour,CarWheel wheel,int topSpeed,String brand,int noOfSeating,CarFuel fuel,int driveWheel,String colours){
		super(wheel,topSpeed,brand,noOfSeating);
		super.setFuel(fuel,driveWheel,colour);
		this.colours=colours;
		
		
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
	@Override
	void transportation(){
	System.out.println("running transportation in Thar");
	}
	@Override
	void personalMobility (){
		System.out.println("running personalMobility in Thar");
	}
	@Override
	void cargoHauling(){
		System.out.println("running cargoHauling in Thar");
	}
	@Override
	void emergencyResponse(){
		System.out.println("running emergencyResponse in Thar");
	
	
	
	}
	
	
	
}