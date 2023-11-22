class Clock{
	
	String company;
	String shape;
	double cost;
	String madeIn;
	
	Clock(){
		super();
		System.out.println("Creating Clock");
		
	}
	Clock(String company)
	{
		super();
		this.company=company;
		
	}
	Clock(String company,String shape)
	{
		super();
		this.company=company;
		this.shape=shape;
	}
	Clock(String company, String shape,double cost)
	{
		super();
		this.company=company;
		this.shape=shape;
		this.cost=cost;
	}
	Clock(String company,String shape, double cost, String madeIn)
	{
		super();
		this.company=company;
		this.shape=shape;
		this.cost=cost;
		this.madeIn=madeIn;
	}
	
	
	
	
	
	
	
}