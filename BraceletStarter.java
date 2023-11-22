class BraceletStarter{
	
	public static void main(String []chain)
	{
		System.out.println("Starting main in BraceletStarter");
		Bracelet bracelet =new Bracelet();
		System.out.println("Bracelet material:"+ bracelet.material);
		System.out.println("Bracelet cost:"+ bracelet.cost);
		System.out.println("Bracelet weight in gm:"+ bracelet.weight);
		System.out.println("Bracelet length:"+ bracelet.length);
		System.out.println("Bracelet madeIn:"+ bracelet.madeIn);
		System.out.println("\n");
		Bracelet bracelet1 =new Bracelet("Gold");
		System.out.println("Bracelet1 material:"+ bracelet1.material);
		System.out.println("Bracelet1 cost:"+ bracelet1.cost);
		System.out.println("Bracelet1 weight in gm:"+ bracelet1.weight);
		System.out.println("Bracelet1 length:"+ bracelet1.length);
		System.out.println("Bracelet1 madeIn:"+ bracelet1.madeIn);
	System.out.println("\n");
		Bracelet bracelet2 =new Bracelet("Gold", 61999D);
		System.out.println("Bracelet2 material:"+ bracelet2.material);
		System.out.println("Bracelet2 cost:"+ bracelet2.cost);
		System.out.println("Bracelet2 weightin gm:"+ bracelet2.weight);
		System.out.println("Bracelet2 length:"+ bracelet2.length);
		System.out.println("Bracelet2 madeIn:"+ bracelet2.madeIn);
		System.out.println("\n");
		Bracelet bracelet3 =new Bracelet("Gold", 61999D,10);
		System.out.println("Bracelet3 material:"+ bracelet3.material);
		System.out.println("Bracelet3 cost:"+ bracelet3.cost);
		System.out.println("Bracelet3 weight in gm:"+ bracelet3.weight);
		System.out.println("Bracelet3 length:"+ bracelet3.length);
		System.out.println("Bracelet3 madeIn:"+ bracelet3.madeIn);
		System.out.println("\n");
		Bracelet bracelet4 =new Bracelet("Gold", 61999D,10, 13);
		System.out.println("Bracelet4 material:"+ bracelet4.material);
		System.out.println("Bracelet4 cost:"+ bracelet4.cost);
		System.out.println("Bracelet4 weight in gm:"+ bracelet4.weight);
		System.out.println("Bracelet4 length in cm:"+ bracelet4.length);
		System.out.println("Bracelet4 madeIn:"+ bracelet4.madeIn);
		System.out.println("\n");
		Bracelet bracelet5 =new Bracelet("Gold", 61999D,10, 13, "India");
		System.out.println("Bracelet5 material:"+ bracelet5.material);
		System.out.println("Bracelet5 cost:"+ bracelet5.cost);
		System.out.println("Bracelet5 weight in gm:"+ bracelet5.weight);
		System.out.println("Bracelet5 length in cm:"+ bracelet5.length);
		System.out.println("Bracelet5 madeIn:"+ bracelet5.madeIn);
		System.out.println("\n");
		
		
		
		System.out.println("Ending main in BraceletStarter");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}