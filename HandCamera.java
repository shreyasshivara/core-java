class HandCamera extends Camera{
	
	double weight;//set
	
	HandCamera(Colour colour,int duration,double pixel){
		super(colour,duration,pixel);
	}
	
	void setWeight(double weight,String brand)
	{
		super.setBrand(brand);
		System.out.println("running setWeight in HandCamera");
		this.weight=weight;
		System.out.println("The weight is :"+ weight + "gm");
	}
	
	
}