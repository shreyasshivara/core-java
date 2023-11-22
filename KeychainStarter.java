class KeychainStarter{
	
	public static void main(String []key)
	{
		System.out.println("Starting main in KeychainStarter");
		Keychain keychain=new Keychain();
		System.out.println("Keychain material:"+ keychain.material);
		System.out.println("Keychain cost in rs:"+ keychain.cost);
		System.out.println("Keychain type:"+ keychain.type);
		System.out.println("Keychain noOfKeys:"+ keychain.noOfKeys);
		System.out.println("Keychain purpose:"+ keychain.purpose);
			System.out.println("\n");
			Keychain keychain1=new Keychain("steel");
		System.out.println("Keychain1 material:"+ keychain1.material);
		System.out.println("Keychain1 cost in rs:"+ keychain1.cost);
		System.out.println("Keychain1 type:"+ keychain1.type);
		System.out.println("Keychain1 noOfKeys:"+ keychain1.noOfKeys);
		System.out.println("Keychain1 purpose:"+ keychain1.purpose);
			System.out.println("\n");
			Keychain keychain2=new Keychain("steel",100);
		System.out.println("Keychain2 material:"+ keychain2.material);
		System.out.println("Keychain2 cost in rs:"+ keychain2.cost);
		System.out.println("Keychain2 type:"+ keychain2.type);
		System.out.println("Keychain2 noOfKeys:"+ keychain2.noOfKeys);
		System.out.println("Keychain2 purpose:"+ keychain2.purpose);
			System.out.println("\n");
			Keychain keychain3=new Keychain("steel",100, "small");
		System.out.println("Keychain3 material:"+ keychain3.material);
		System.out.println("Keychain3 cost in rs:"+ keychain3.cost);
		System.out.println("Keychain3 type:"+ keychain3.type);
		System.out.println("Keychain3 noOfKeys:"+ keychain3.noOfKeys);
		System.out.println("Keychain3 purpose:"+ keychain3.purpose);
			System.out.println("\n");
			Keychain keychain4=new Keychain("steel",100, "small",4);
		System.out.println("Keychain4 material:"+ keychain4.material);
		System.out.println("Keychain4 cost in rs:"+ keychain4.cost);
		System.out.println("Keychain4 type:"+ keychain4.type);
		System.out.println("Keychain4 noOfKeys:"+ keychain4.noOfKeys);
		System.out.println("Keychain4 purpose:"+ keychain4.purpose);
			System.out.println("\n");
			Keychain keychain5=new Keychain("steel",100, "small",4, "Security");
		System.out.println("Keychain5 material:"+ keychain5.material);
		System.out.println("Keychain5 cost in rs:"+ keychain5.cost);
		System.out.println("Keychain5 type:"+ keychain5.type);
		System.out.println("Keychain5 noOfKeys:"+ keychain5.noOfKeys);
		System.out.println("Keychain5 purpose:"+ keychain5.purpose);
			System.out.println("\n");
		
		
		
		
		
		
		
		
		
		System.out.println("Starting main in KeychainStarter");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}