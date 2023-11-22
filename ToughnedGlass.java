class ToughnedGlass extends Glass{
	
	double weight;//const
	String ownerName;//ref
	
	ToughnedGlass(double weight){
		this.weight=weight;
		System.out.println("Weight is:"+ weight);
	}
	ToughnedGlass(double thickness,String brand){
		super(thickness,brand);
	}
	void setGlassType(GlassType type,String usage){
		super.setType(type,usage);
	}
}