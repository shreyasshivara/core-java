class HotelMenuCard{
	
	public static void main(String[]food)
	{
		System.out.println("Starting main in HotelMenuCard");
		
		MenuCard menuCard=new MenuCard();
		menuCard.SetInfo(6,1299D);
		
		Hotel hotel =new Hotel("Hanumanthu","Vijaykumar",menuCard);
		hotel.ShowInfo();
		
		
		
		
		
		
		
		
		
		System.out.println("Ending main in HotelMenuCard");
		
		
	}
	
	
	
	
	
	
	
	
	
	
}