class Helmet{
	
	String brand;
	String type;
	double cost;
	String material;
	String colour;
	
	Helmet()
	{
		System.out.println("Helmet Created");
			
	}
	Helmet(String brand)
	
	{
		super();
		this.brand=brand;
	}
	Helmet(String brand, String type)
	{
		this(brand);
		this.type=type;
	}
	Helmet(String brand, String type,double cost)
	{
		this(brand,type);
		this.cost=cost;
	}
	Helmet(String brand, String type,double cost, String material)
	{
		this(brand,type,cost);
		this.material=material;
	}
	Helmet(String brand, String type,double cost, String material,String colour)
	{
		this(brand,type,cost,material);
		this.colour=colour;
	}
	
	
	
	
	
}