class Walletstarter{
	
	public static void main(String [] cash)
	{
		System.out.println("Starting main in WalletStarter");
		Wallet wallet = new Wallet();
		System.out.println("Wallet cost in rupees:"+ wallet.cost);
		System.out.println("Wallet colour :"+ wallet.colour);
		System.out.println("Wallet brand:"+ wallet.brand);
		System.out.println("Wallet material:"+ wallet.material);
				System.out.println("\n");

		Wallet wallet1 = new Wallet(999);
		System.out.println("Wallet1 cost in rupees:"+ wallet1.cost);
		System.out.println("Wallet1 colour :"+ wallet1.colour);
		System.out.println("Wallet1 brand:"+ wallet1.brand);
		System.out.println("Wallet1 material:"+ wallet1.material);
				System.out.println("\n");

		
		Wallet wallet2 = new Wallet(999, "Black");
		System.out.println("Wallet2 cost in rupees:"+ wallet2.cost);
		System.out.println("Wallet2 colour :"+ wallet2.colour);
		System.out.println("Wallet2 brand:"+ wallet2.brand);
		System.out.println("Wallet2 material:"+ wallet2.material);
				System.out.println("\n");

		Wallet wallet3 = new Wallet(999, "Black", "guess");
		System.out.println("Wallet3 cost in rupees:"+ wallet3.cost);
		System.out.println("Wallet3 colour :"+ wallet3.colour);
		System.out.println("Wallet3 brand:"+ wallet3.brand);
		System.out.println("Wallet3 material:"+ wallet3.material);
				System.out.println("\n");

		Wallet wallet4 = new Wallet(999, "Black", "levis");
		System.out.println("Wallet4 cost in rupees:"+ wallet4.cost);
		System.out.println("Wallet4 colour :"+ wallet4.colour);
		System.out.println("Wallet4 brand:"+ wallet4.brand);
		System.out.println("Wallet4 material:"+ wallet4.material);
		
		
		
		
		System.out.println("Ending main in WalletStarter");
		
	}
	
	
	
	
	
	
	
	
}