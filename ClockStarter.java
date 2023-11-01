class ClockStarter{
	
	public static void main (String []Time)
	{
	
	Clock clock =new Clock();
	System.out.println("Starting main in ClockStarter");
	System.out.println("clock company:"+ clock.company);
	System.out.println("clock shape:"+ clock.shape);
	System.out.println("clock cost:"+ clock.cost);
	System.out.println("clock madeIn:"+ clock.madeIn);
	System.out.println("\n");
	Clock clock1 =new Clock("Ajanta");
	System.out.println("clock1 company:"+ clock1.company);
	System.out.println("clock1 shape:"+ clock1.shape);
	System.out.println("clock1 cost:"+ clock1.cost);
	System.out.println("clock1 madeIn:"+ clock1.madeIn);
	System.out.println("\n");
	Clock clock2 =new Clock("Ajanta","round");
	System.out.println("clock2 company:"+ clock2.company);
	System.out.println("clock2 shape:"+ clock2.shape);
	System.out.println("clock2 cost:"+ clock2.cost);
	System.out.println("clock2 madeIn:"+ clock2.madeIn);
	System.out.println("\n");
	Clock clock3 =new Clock("Ajanta","Square", 1500D);
	System.out.println("clock3 company:"+ clock3.company);
	System.out.println("clock3 shape:"+ clock3.shape);
	System.out.println("clock3 cost:"+ clock3.cost);
	System.out.println("clock3 madeIn:"+ clock3.madeIn);
	System.out.println("\n");
	Clock clock4 =new Clock("Ajanta","round", 1500D, "India");
	System.out.println("clock4 company:"+ clock4.company);
	System.out.println("clock4 shape:"+ clock4.shape);
	System.out.println("clock4 cost:"+ clock4.cost);
	System.out.println("clock4 madeIn:"+ clock4.madeIn);
	System.out.println("\n");
	

	System.out.println("Ending main in ClockStarter");
}
}