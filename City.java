class City{
	
	String name;//const
	String StateName="Karnataka";
	
	City(String name){
		this.name=name;
		System.out.println("Created City using String org const....");
	}
	void Show(){
		System.out.println("Starting Show in City");
		
		System.out.println("The name is :"+ this.name);
		System.out.println("The statename is :"+ this.StateName);

		System.out.println("Ending Show in city");
	}
	
	
	
	
	
	
	
	
	
}