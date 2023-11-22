class LaminatedGlass extends Glass{
	
	double cost;//ref
	int warranty;//const
	
	
	LaminatedGlass(){
		
	}
	
	LaminatedGlass(int warranty){
		this.warranty=warranty;
		System.out.println("Warranty is :"+ warranty);
	}
}