class Hotel{
	
	String name;
	String ownerName;
	MenuCard menuCard;
	
    Hotel(String name,String ownerName,MenuCard menuCard)
	{
		this.name=name;
		this.ownerName=ownerName;
		this.menuCard=menuCard;
		
	}
	void ShowInfo()
	{
		System.out.println("The hotel name is :"+this.name);
		System.out.println("The owner name is :"+this.ownerName);
		System.out.println("The menuCard is:"+ this.menuCard);
		System.out.println("The total items are:"+ menuCard.totalItems);
		System.out.println("The cost is :"+ menuCard.cost);
		
	}
	
	
	
	
	
	
	
	
}