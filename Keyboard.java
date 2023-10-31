class Keyboard{
	
	String brand;
	String colour;
	int noOfKeys;
	double cost;
	String type;
	
	Keyboard ()
	{
		System.out.println("Crearing keyboard");
		
	}
	
	Keyboard(String brand)
	{
		this.brand=brand;
		
	}
	Keyboard(String brand, String colour)
	{
		this.brand=brand;
		this.colour=colour;
	}
	Keyboard(String brand, String colour,int noOfKeys)
	{
		this.brand=brand;
		this.colour=colour;
		this.noOfKeys=noOfKeys;
	}
	
	Keyboard(String brand, String colour, int noOfKeys, double cost)
	{
		this.brand=brand;
		this.colour=colour;
		this.noOfKeys=noOfKeys;
		this.cost=cost;
	}
	Keyboard(String brand, String colour, int noOfKeys, double cost, String type)
	{
		this.brand=brand;
		this.colour=colour;
		this.noOfKeys=noOfKeys;
		this.cost=cost;
		this.type=type;
	}
	
	
	
	
	
	
	
	
	
}