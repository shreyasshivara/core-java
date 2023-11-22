class OrnamentStarter{
	
	public static void main(String [] jewells)
	{
		System.out.println("Starting main in OrnamentStarter");
		Ornament ornament =new Ornament();
		System.out.println("Ornament type:"+ ornament.type);
		System.out.println("Ornament material:"+ ornament.material);
		System.out.println("Ornament weight in gm:"+ ornament.weight);
		System.out.println("Ornament cost in rs:"+ ornament.cost);
		System.out.println("\n");
		
		Ornament ornament1 =new Ornament("Chain");
		System.out.println("Ornament1 type:"+ ornament1.type);
		System.out.println("Ornament1 material:"+ ornament1.material);
		System.out.println("Ornament1 weight in gm:"+ ornament1.weight);
		System.out.println("Ornament1 cost in rs:"+ ornament1.cost);
				System.out.println("\n");

		Ornament ornament2 =new Ornament("Ring", "Gold");
		System.out.println("Ornament2 type:"+ ornament2.type);
		System.out.println("Ornament2 material:"+ ornament2.material);
		System.out.println("Ornament2 weight in gm:"+ ornament2.weight);
		System.out.println("Ornament2 cost in rs:"+ ornament2.cost);
				System.out.println("\n");

		Ornament ornament3 =new Ornament("Chain", "Gold",20.2D);
		System.out.println("Ornament3 type:"+ ornament3.type);
		System.out.println("Ornament3 material:"+ ornament3.material);
		System.out.println("Ornament3 weight in gm:"+ ornament3.weight);
		System.out.println("Ornament3 cost in rs:"+ ornament3.cost);
				System.out.println("\n");

		Ornament ornament4 =new Ornament("Chain", "Gold",20.2D,98999D);
		System.out.println("Ornament4 type:"+ ornament4.type);
		System.out.println("Ornament4 material:"+ ornament4.material);
		System.out.println("Ornament4 weight in gm:"+ ornament4.weight);
		System.out.println("Ornament4 cost in rs:"+ ornament4.cost);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}