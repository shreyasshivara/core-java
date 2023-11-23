class CarStarter{
	public static void main(String[] vehicle){
		System.out.println("Starting main in CarStarter");
		
		Car1 car=new Thar(CarWheel.FOUR,160, "Mahindra",5 );
		car.enginecc= 2184;
		System.out.println("enginecc:"+car.enginecc);
		car.turbo= true;
		System.out.println("Turbo?:"+car.turbo);
		car.type="SUV";
		System.out.println("Type:"+car.type);
		car.setFuel(CarFuel.DIESEL,4, "Black");
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
		
		
		
		
		Thar thar =new Thar("black");
		
		thar.cost=1899999d;
			System.out.println("cost:"+thar.cost);
		thar.offRoading();
		thar.dailyCommuter();
		thar.adventureCompanion();
		thar.lifestyleStatement();
		thar.transportation();
		thar.personalMobility();
		thar.cargoHauling();
		thar.emergencyResponse();
		
		
		
		
		
		
		
		
		
		System.out.println("Ending main in CarStarter");
	}
}