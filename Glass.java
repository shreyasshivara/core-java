class Glass{
	
	double length;//ref
	double thickness;//const
	GlassType type;//set
	String usage;//set
	String brand;//const
	
	Glass(){
		
	}
	Glass(double thickness,String brand){
		System.out.println("Created glass using double,String arg const.....");
		this.thickness=thickness;
		this.brand=brand;
	System.out.println("Thickness is :"+ thickness +"mm");
	System.out.println("Brand is :"+ brand);
	}
	void setType(GlassType type,String usage){
		this.type=type;
		this.usage=usage;
		System.out.println("GlassType is :"+ type);
		System.out.println("Usage:"+ usage);
	}
	
	
	
	
	
	
	
};