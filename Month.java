class Month{
	
	String name;
	int noOfDays;
	int noOfWeekends;
	int noOfHolidays;
	
	Month(String name,int noOfDays,int noOfWeekends,int noOfHolidays)
	{
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekends=noOfWeekends;
		this.noOfHolidays=noOfHolidays;
	}
	void DisplayInfo()
	{
		System.out.println("month is :"+ this.name);
		System.out.println("noOfDays :"+ this.noOfDays);
		System.out.println("noOfWeekends :"+ this.noOfWeekends);
		System.out.println("noOfHolidays :"+ this.noOfHolidays);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}