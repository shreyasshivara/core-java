class HardWare{
	
	String name;//const
	String type;
	Brand brand;//const
	
	HardWare(String name,Brand brand){
		this.brand=brand;
		this.name=name;
		System.out.println("Created HardWare using Brand&String org const...");
	}
	void hardWaretype(String type)
	{
		this.type=type;
		
	}	
	void Show(){
		
		System.out.println("Starting main in Hardware");
		System.out.println("The type is :"+ this.type);
		System.out.println("The brand is :"+this.brand);
		System.out.println("Ending main in Hardware");
	}
	
	
	
	
	
	
	
	
	
	
	
}