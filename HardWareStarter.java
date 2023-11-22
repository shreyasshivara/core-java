class HardWareStarter{
	
	
	public static void main(String[]computer)
	{
		System.out.println("Starting main in HardWareStarter");
		City city=new City("hassan");
		City city1=new City("mysore");
		City city2=new City("banglore");
		City city3=new City("tumkur");
		City city4=new City("belgam");
		City city5=new City("mandya");
		City[] place={city,city1,city2,city3,city4,city5};
		
		
		Brand brand =new Brand("Hp",place);
		brand.setOrigin("India");
		brand.setCEOName("Hithesh");
		
		Address address=new Address(city);
		address.setPincode(573111);
		//HardWare[] hard={"mouse", "keyboard", "display", "motherboard", "speaker", "screen", "key", "sensor", "speaker", "Mouse"};
		
		HardWare hardWare1=new HardWare("Keyboard",brand);
		HardWare hardWare2=new HardWare("display",brand);
		HardWare hardWare3=new HardWare("motherboard",brand);
		HardWare hardWare4=new HardWare("speaker",brand);
		HardWare hardWare5=new HardWare("screen",brand);
		HardWare hardWare6=new HardWare("key",brand);
		HardWare hardWare7=new HardWare("sensor",brand);
		HardWare hardWare8=new HardWare("speaker",brand);
		HardWare hardWare9=new HardWare("Mouse",brand);
		
		
		HardWare[] hard={hardWare1,hardWare2,hardWare3,hardWare4,hardWare5,hardWare6,hardWare7,hardWare8,hardWare9};
		
		HardWare hardWare=new HardWare("HP",brand);
		
		hardWare.hardWaretype("Wireless");
		
		Owner owner=new Owner("banglore");
		owner.setEmail("Shreyasgowdasc@gmail.com");
		owner.permanentAdress="Hassan";
		
		LapTop laptop =new LapTop(brand);
		laptop.sethardWares(hard);
		laptop.laptopOwner(owner);
		laptop.Show();
		
		System.out.println("Ending main in HardWareStarter");
	}

	
	
	
}