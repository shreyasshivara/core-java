class KeyboardStarter{
	
	public static void main(String [] key)
	{
		Keyboard keyboard=new Keyboard();
		System.out.println("keyboard brand :"+ keyboard.brand);
		System.out.println("keyboard colour :"+ keyboard.colour);
		System.out.println("keyboard noOfKeys :"+ keyboard.noOfKeys);
		System.out.println("keyboard type :"+ keyboard.type);
		System.out.println("keyboard cost :"+ keyboard.cost);
		System.out.println("\n");
		Keyboard keyboard1=new Keyboard("lenovo");
		System.out.println("keyboard1 brand :"+ keyboard1.brand);
		System.out.println("keyboard1 colour :"+ keyboard1.colour);
		System.out.println("keyboard1 noOfKeys :"+ keyboard1.noOfKeys);
		System.out.println("keyboard1 type :"+ keyboard1.type);
		System.out.println("keyboard1 cost :"+ keyboard1.cost);
			System.out.println("\n");
		
		Keyboard keyboard2=new Keyboard("hp", "black");
		System.out.println("keyboard2 brand :"+ keyboard2.brand);
		System.out.println("keyboard2 colour :"+ keyboard2.colour);
		System.out.println("keyboard2 noOfKeys :"+ keyboard2.noOfKeys);
		System.out.println("keyboard2 type :"+ keyboard2.type);
		System.out.println("keyboard2 cost :"+ keyboard2.cost);
			System.out.println("\n");
		Keyboard keyboard3=new Keyboard("lenovo", "black",104);
		System.out.println("keyboard3 brand :"+ keyboard3.brand);
		System.out.println("keyboard3 colour :"+ keyboard3.colour);
		System.out.println("keyboard3 noOfKeys :"+ keyboard3.noOfKeys);
		System.out.println("keyboard3 type :"+ keyboard3.type);
		System.out.println("keyboard3 cost :"+ keyboard3.cost);
			System.out.println("\n");
		Keyboard keyboard4=new Keyboard("hp", "black",104, 45000D);
		System.out.println("keyboard4 brand :"+ keyboard4.brand);
		System.out.println("keyboard4 colour :"+ keyboard4.colour);
		System.out.println("keyboard4 noOfKeys :"+ keyboard4.noOfKeys);
		System.out.println("keyboard4 type :"+ keyboard4.type);
		System.out.println("keyboard4 cost :"+ keyboard4.cost);
			System.out.println("\n");
		Keyboard keyboard5=new Keyboard("hp", "black",104, 45000D, "Wireless");
		System.out.println("keyboard5 brand :"+ keyboard5.brand);
		System.out.println("keyboard5 colour :"+ keyboard5.colour);
		System.out.println("keyboard5 noOfKeys :"+ keyboard5.noOfKeys);
		System.out.println("keyboard5 type :"+ keyboard5.type);
		System.out.println("keyboard5 cost :"+ keyboard5.cost);
	}
	
	
	
	
	
	
	
	
}