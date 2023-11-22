class Brand{
	
	String name;//const
	String origin;//set
	String ceoName;//ref
	City[] cities;//const
	
	
	Brand(String name,City[] cities)
	{
		this.cities=cities;
		this.name=name;
		System.out.println("Created Brand using City & String org const......");
	}
	void setOrigin(String origin){
		this.origin=origin;
	}
	void setCEOName(String ceoName){
		this.ceoName=ceoName;
	}
	
	void Show()
	{
		System.out.println("Starting show in Brand");
		System.out.println("The name is :"+ this.name);
		System.out.println("The origin is :"+ this.origin);
		System.out.println("The ceoName is :"+ this.ceoName);
		System.out.println("The city name is :"+ this.cities);
		if (this.cities!=null){
			for (int seq=0;seq<this.cities.length;seq++){
				City place=this.cities[seq];
				place.Show();
			}
		}
		
		
		
		
		System.out.println("Ending show in Brand");
	}
	
	
}