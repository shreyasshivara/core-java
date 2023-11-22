class Rocket{
	
	String type;
	String material;
	int weight;
	int length;
	
	Rocket()
	{
		super();
		System.out.println("Rocket created");
	}
	Rocket(String type)
	{
		super();
		this.type=type;
	}
	Rocket(String type,String material)
	{
		super();
		this.type=type;
		this.material=material;
	}
	Rocket(String type,String material, int weight)
	{
		super();
		this.type=type;
		this.material=material;
		this.weight=weight;
	}
	Rocket(String type,String material, int weight, int length)
	{
		super();
		this.type=type;
		this.material=material;
		this.weight=weight;
		this.length=length;
	}
	
	
	
	
	
	
	
	
}