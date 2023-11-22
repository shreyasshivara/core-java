class CarromStarter{
	
	public static void main(String[]Board)
	{
		System.out.println("Starting main in CarromStarter");
		Carrom carrom=new Carrom();
		System.out.println("Carrom noOfPons:"+ carrom.noOfpons);
		System.out.println("Carrom material:"+ carrom.material);
		System.out.println("Carrom cost in rs:"+ carrom.cost);
		System.out.println("Carrom noOfPlayers:"+ carrom.noOfPlayers);
		System.out.println("Carrom noOfPouch:"+ carrom.noOfPouch);
		System.out.println("\n");
		Carrom carrom1=new Carrom(21);
		System.out.println("Carrom1 noOfPons:"+ carrom1.noOfpons);
		System.out.println("Carrom1 material:"+ carrom1.material);
		System.out.println("Carrom1 cost in rs:"+ carrom1.cost);
		System.out.println("Carrom1 noOfPlayers:"+ carrom1.noOfPlayers);
		System.out.println("Carrom1 noOfPouch:"+ carrom1.noOfPouch);
		System.out.println("\n");
		Carrom carrom2=new Carrom(21, "Wood");
		System.out.println("Carrom2 noOfPons:"+ carrom2.noOfpons);
		System.out.println("Carrom2 material:"+ carrom2.material);
		System.out.println("Carrom2 cost in rs:"+ carrom2.cost);
		System.out.println("Carrom2 noOfPlayers:"+ carrom2.noOfPlayers);
		System.out.println("Carrom2 noOfPouch:"+ carrom2.noOfPouch);
		System.out.println("\n");
		Carrom carrom3=new Carrom(21, "Wood",999D);
		System.out.println("Carrom3 noOfPons:"+ carrom3.noOfpons);
		System.out.println("Carrom3 material:"+ carrom3.material);
		System.out.println("Carrom3 cost in rs:"+ carrom3.cost);
		System.out.println("Carrom3 noOfPlayers:"+ carrom3.noOfPlayers);
		System.out.println("Carrom3 noOfPouch:"+ carrom3.noOfPouch);
		System.out.println("\n");
		Carrom carrom4=new Carrom(21, "Wood",999D,4);
		System.out.println("Carrom4 noOfPons:"+ carrom4.noOfpons);
		System.out.println("Carrom4 material:"+ carrom4.material);
		System.out.println("Carrom4 cost in rs:"+ carrom4.cost);
		System.out.println("Carrom4 noOfPlayers:"+ carrom4.noOfPlayers);
		System.out.println("Carrom4 noOfPouch:"+ carrom4.noOfPouch);
		System.out.println("\n");
		Carrom carrom5=new Carrom(21, "Wood",999D,4,4);
		System.out.println("Carrom5 noOfPons:"+ carrom5.noOfpons);
		System.out.println("Carrom5 material:"+ carrom5.material);
		System.out.println("Carrom5 cost in rs:"+ carrom5.cost);
		System.out.println("Carrom5 noOfPlayers:"+ carrom5.noOfPlayers);
		System.out.println("Carrom5 noOfPouch:"+ carrom5.noOfPouch);
		System.out.println("\n");
		
		
	
		System.out.println("Ending main in CarromStarter");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}