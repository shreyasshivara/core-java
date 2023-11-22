class Camera {
	String brand;//set
	Colour colour;//const
	double pixel;//const
	int duration;//const
	
	Camera(){
		
	}
	
	Camera(Colour colour,int duration,double pixel){
		System.out.println("Created Camera using String,Colour,int arg const.......");
		this.colour=colour;
		this.duration=duration;
		this.pixel=pixel;
		System.out.println("The colour is:"+ colour);
		System.out.println("The pixel is:"+ pixel);
		System.out.println("The duration is:"+duration + "hrs");
	}
	void setBrand(String brand){
		
		System.out.println("Running setBrand in camera");
		this.brand=brand;
		System.out.println("The brand is :"+ brand);
	}
	
	
	
	
	
}
