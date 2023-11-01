class Wallet{
	
	int cost;
	String colour;
	String brand;
	String material;
	
	Wallet()
	{
		super();
		System.out.println("Wallet created");
	}
	Wallet(int cost){
		super();
		this.cost=cost;
	}
	Wallet(int cost, String colour){
		super();
		this.cost=cost;
		this.colour=colour;
	}
	Wallet(int cost, String colour, String brand){
		super();
		this.cost=cost;
		this.colour=colour;
		this.brand=brand;
	}
	Wallet(int cost, String colour, String brand,String material){
		super();
		this.cost=cost;
		this.colour=colour;
		this.brand=brand;
		this.material=material;
	}
	
	
	
	
	
	
	
	
	
	
}