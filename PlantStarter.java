class PlantStarter{
	
	public static void main(String[]vegetables){
		System.out.println("Starting main in PlantStarter");
		Plant plant= new Food1();
		Food1 food1=(Food1)plant;// casting    
		food1.fruit();
		Food1 food11=new Food1();
		food11.hungry();

		
		
		System.out.println("Ending main in PlantStarter");
		
	}
	
	
	
	
	
	
	
	
	
}