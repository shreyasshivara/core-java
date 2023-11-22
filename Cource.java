class Cource{
	
	String name;
	String institution;
	double fees;
	String location;
	String teaching;
	boolean placements;
	int duration;
	
	Cource(String name,String institution,double fees,String location,String teaching,boolean placements,int duration)
	{
		
		this.name=name;
		this.institution=institution;
		this.fees=fees;
		this.location=location;
		this.teaching=teaching;
		this.placements=placements;
		this.duration=duration;
	}
	void DisplayInfo()
	{
		System.out.println("The cource name is :"+ this.name);
		System.out.println("The institution name is :"+ this.institution);
		System.out.println("The fees is :"+ this.fees);
		System.out.println("location is :"+ this.location);
		System.out.println("THe teaching is:"+ this.teaching);
		System.out.println("placements :"+ this.placements);
		System.out.println("cource duration:"+ this.duration);
	}
	
	
	
	
	
}