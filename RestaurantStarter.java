class RestaurantStarter{
	
	public static void main(String[]Food)
	{
		System.out.println("Starting main in RestuarantStarter");
		String[] specialItems={"Cholebature", "Kesribath", "Gulab jamoon", "pongal", "masaladosa"};
		Restaurant restaurant=new Restaurant("Shreyas",specialItems);
		restaurant.Show();
		

	  Canteen canteen=new Canteen();
	  canteen.SetType("veg");
	  	String[] utensils={"Canisters", "Dish towels", "Pot holders", "Trivets", "Tongs", "Mallets", "Muddlers", "Vegetable peelers", "Garlic presses",
		"Measuring cups and spoons", "plate", "spoon", "cups", "glass", "bowls", "kinfe", "fork", "Canisters", "Dish towels", "Pot holders", "Trivets", "Tongs", "Mallets", "Muddlers", "Vegetable peelers", "Garlic presses",
		"Measuring cups and spoons", "plate", "spoon", "cups", "glass", "bowls", "kinfe", "fork"};
		canteen.setUtensils(utensils);
		canteen.Show();
		
		ATM atm =new ATM();
		atm.BankName("Sbi");
		String[] branch={"crp", "hassan", "Mysore", "banglore", "sakleshpura"};
		atm.Branch(branch);
		String[] acs={"BlueStar", "Samsung", "LG"};
		atm.ACS(acs);
		String[] camera ={"Hikvision", "Dahua", "Axis", "Hanwha Techwin", "Bosch"};
		atm.CCTVBrands(camera);
		atm.Show();
		
		
		
		
		
		
		
		System.out.println("Ending main in RestuarantStarter");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
