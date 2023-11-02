class Keychain{
	
	String material;
	double cost;
	String type;
	int noOfKeys;
	String purpose;
	
	
	Keychain(){
		
		System.out.println("Created keychain");
		
	}
	Keychain(String material)
	{
		super();
		this.material=material;
	}
	Keychain(String material, double cost)
	{
		this( material);
		this.cost=cost;
	}
	Keychain(String material, double cost, String type)
	{
		this( material, cost);
		this.type=type;
	}
	Keychain(String material, double cost, String type, int noOfKeys)
	{
		this( material,  cost,  type);
		this.noOfKeys=noOfKeys;
	}
	Keychain(String material, double cost, String type, int noOfKeys, String purpose)
	{
		this(material,cost,type,noOfKeys);
		this.purpose=purpose;
	}
	
	
	
	
	
	
	
	
}