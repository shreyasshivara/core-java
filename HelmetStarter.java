class HelmetStarter{
	
	public static void main(String []Safe)
	{
		System.out.println("Starting main in HelmetStarter");
		
		Helmet helmet=new Helmet();
		System.out.println("Helmet brand:"+ helmet.brand);
		System.out.println("Helmet type:"+ helmet.type);
		System.out.println("Helmet cost:"+ helmet.cost);
		System.out.println("Helmet material:"+ helmet.material);
		System.out.println("Helmet colour:"+ helmet.colour);
		System.out.println("\n");
		Helmet helmet1=new Helmet("Axor");
		System.out.println("Helmet1 brand:"+ helmet1.brand);
		System.out.println("Helmet1 type:"+ helmet1.type);
		System.out.println("Helmet1 cost:"+ helmet1.cost);
		System.out.println("Helmet1 material:"+ helmet1.material);
		System.out.println("Helmet1 colour:"+ helmet1.colour);
		System.out.println("\n");
		Helmet helmet2=new Helmet("Axor", "motocross");
		System.out.println("Helmet2 brand:"+ helmet2.brand);
		System.out.println("Helmet2 type:"+ helmet2.type);
		System.out.println("Helmet2 cost:"+ helmet2.cost);
		System.out.println("Helmet2 material:"+ helmet2.material);
		System.out.println("Helmet2 colour:"+ helmet2.colour);
		System.out.println("\n");
		Helmet helmet3=new Helmet("Axor", "motocross",5599);
		System.out.println("Helmet3 brand:"+ helmet3.brand);
		System.out.println("Helmet3 type:"+ helmet3.type);
		System.out.println("Helmet3 cost:"+ helmet3.cost);
		System.out.println("Helmet3 material:"+ helmet3.material);
		System.out.println("Helmet3 colour:"+ helmet3.colour);
		System.out.println("\n");
		Helmet helmet4=new Helmet("Axor", "motocross" ,5599, "Fiber");
		System.out.println("Helmet4 brand:"+ helmet4.brand);
		System.out.println("Helmet4 type:"+ helmet4.type);
		System.out.println("Helmet4 cost:"+ helmet4.cost);
		System.out.println("Helmet4 material:"+ helmet4.material);
		System.out.println("Helmet4 colour:"+ helmet4.colour);
		System.out.println("\n");
		Helmet helmet5=new Helmet("Axor", "motocross",5599, "Fiber", "Black");
		System.out.println("Helmet5 brand:"+ helmet5.brand);
		System.out.println("Helmet5 type:"+ helmet5.type);
		System.out.println("Helmet5 cost:"+ helmet5.cost);
		System.out.println("Helmet5 material:"+ helmet5.material);
		System.out.println("Helmet5 colour:"+ helmet5 .colour);
		
		
		
		System.out.println("Ending type in HelmetStarter");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}