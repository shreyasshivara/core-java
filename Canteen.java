class Canteen{
	
	String type;//set
	String[] utensils;//set
	
	
	void SetType(String type)
	{
		this.type=type;
	}
	void setUtensils(String[] utensils)
	{
		this.utensils=utensils;
		
	}
	void Show()
	{
		System.out.println("Starting show in canteen");
		System.out.println("The canteen type is:"+this.type);
		System.out.println("The utensils is :"+this.utensils);
		if (this.utensils!=null){
			for (int seq=0;seq<this.utensils.length; seq++){
				String ref=utensils[seq];
				System.out.println("utensil is :"+ ref);
			}
		}
		System.out.println("Ending show in canteen");
	}
	
	
	
	
	
	
	
	
	
}