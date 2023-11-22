class Matchbox{
	
	String brand;
	int noOfSticks;
	double length;
	int price;
	String size;
	double weight;
	String type; 
	
	Matchbox()
	{
		System.out.println("Creating matchbox");
		
	}
	Matchbox(String brand)
	{
		this.brand=brand;
		
	}
	Matchbox(String brand, int noOfSticks)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
	}
	Matchbox(String brand, int noOfSticks, double length)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.length=length;
	}
	Matchbox(String brand, int noOfSticks, int price,double length)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.price=price;
		this.length=length;
	}
	Matchbox(String brand, int noOfSticks, int price, double length,String size)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.price=price;
		this.length=length;
		this.size=size;
	}
	Matchbox(String brand, int noOfSticks, int price,double length, String size, double weight)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.price=price;
		this.size=size;
		this.weight=weight;
	}
	Matchbox(String brand, int noOfSticks, int price, double length,String size, double weight, String type)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.price=price;
		this.length=length;
		this.size=size;
		this.weight=weight;
		this.type=type;
	}
	
	
	
	
	
	
	
	
	
}