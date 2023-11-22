class Restaurant{
	
	String ownerName;//const
	String[] specialItems;//const
	
	Restaurant(String ownerName,String[] specialItems){
		this.ownerName=ownerName;
		this.specialItems=specialItems;
		System.out.println("Created Restaurant using String & String arg const....");
	}
	void Show(){
		System.out.println("Starting Show in Restaurant");
		System.out.println("ownerName is: "+this.ownerName);
		System.out.println("specialItems are :"+ this.specialItems);
		if (this.specialItems!=null){
			for (int seq=0;seq<this.specialItems.length;seq++){
				String ref=this.specialItems[seq];
				
				System.out.println("specialItems: "+ ref );
			}
			
		}
		
		
		
		
		System.out.println("Ending Show in Restaurant");
	}
	
	
	
	
	
	
	
	
}