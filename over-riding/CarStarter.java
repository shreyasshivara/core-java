class CarStarter{
	public static void main(String[] vehicle){
		System.out.println("Starting main in CarStarter");
		
		Thar car=new Thar("black",CarWheel.FOUR,160, "Mahindra",5,CarFuel.DIESEL,4, "white");
		car.enginecc= 2184;
		System.out.println("enginecc:"+car.enginecc);
		car.turbo= true;
		System.out.println("Turbo?:"+car.turbo);
		car.type="SUV";
		System.out.println("Type:"+car.type);
		
		car.transportation();
		car.personalMobility();
		car.cargoHauling();
		car.emergencyResponse();
		car.leisureAndRecreation();
		car.economicActivity();
		car.culturalSymbol();
		car.technologicalAdvancement();
		car.environmentalImpact();
		car.socialImplications();
		car.cost=1899999d;
		System.out.println("cost:"+car.cost);
		
		System.out.println("colour :" +  car.colour);
		System.out.println("Drive wheels:"+ car.driveWheel);
		System.out.println("topspeed:"+ car.topSpeed +"kmph");
		System.out.println("Brand :"+ car.brand);
		System.out.println("seats:"+ car.noOfSeating);
		System.out.println("fuel:"+ car.fuel);
		
		
		System.out.println("drive weels are:"+ car.wheel);
	
		
			System.out.println("the colour is :"+ car.colours);
		
		
		
		
		
		
		
		
		
		
		System.out.println("Ending main in CarStarter");
	}
}