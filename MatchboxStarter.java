class MatchboxStarter{
	
	public static void main (String[]box)
	{
		Matchbox matchbox=new Matchbox();
		System.out.println("Matchbox brand:"+ matchbox.brand);
		System.out.println("Matchbox noOfSticks:"+ matchbox.noOfSticks);
		System.out.println("Matchbox length in cm:"+ matchbox.length);
		System.out.println("Matchbox price:"+ matchbox.price);
		System.out.println("Matchbox size:"+ matchbox.size);
		System.out.println("Matchbox weight in gm:"+ matchbox.weight);
		System.out.println("Matchbox type:"+ matchbox.type);
		System.out.println("\n");
		
		Matchbox matchbox1=new Matchbox("Eagle");
		System.out.println("Matchbox1 brand:"+ matchbox1.brand);
		System.out.println("Matchbox1 noOfSticks:"+ matchbox1.noOfSticks);
		System.out.println("Matchbox1 length in cm:"+ matchbox1.length);
		System.out.println("Matchbox1 price:"+ matchbox1.price);
		System.out.println("Matchbox1 size:"+ matchbox1.size);
		System.out.println("Matchbox1 weight in gm:"+ matchbox1.weight);
		System.out.println("Matchbox1 type:"+ matchbox1.type);
		System.out.println("\n");
		Matchbox matchbox2=new Matchbox("Eagle",100);
		System.out.println("Matchbox2 brand:"+ matchbox2.brand);
		System.out.println("Matchbox2 noOfSticks:"+ matchbox2.noOfSticks);
		System.out.println("Matchbox2 price:"+ matchbox2.price);
		System.out.println("Matchbox2 length in cm:"+ matchbox2.length);
		System.out.println("Matchbox2 size:"+ matchbox2.size);
		System.out.println("Matchbox2 weight in gm:"+ matchbox2.weight);
		System.out.println("Matchbox2 type:"+ matchbox2.type);
		System.out.println("\n");
		Matchbox matchbox3=new Matchbox("Eagle", 100, 150D);
		System.out.println("Matchbox3 brand:"+ matchbox3.brand);
		System.out.println("Matchbox3 noOfSticks:"+ matchbox3.noOfSticks);
		System.out.println("Matchbox3 length in cm:"+ matchbox3.length);
		System.out.println("Matchbox3 price:"+ matchbox3.price);
		System.out.println("Matchbox3 size:"+ matchbox3.size);
		System.out.println("Matchbox3 weight in gm:"+ matchbox3.weight);
		System.out.println("Matchbox3 type:"+ matchbox3.type);
		System.out.println("\n");
		Matchbox matchbox4=new Matchbox("Eagle", 100, 10,155D);
		System.out.println("Matchbox4 brand:"+ matchbox4.brand);
		System.out.println("Matchbox4 noOfSticks:"+ matchbox4.noOfSticks);
		System.out.println("Matchbox4 length in cm:"+ matchbox4.length);
		System.out.println("Matchbox4 price:"+ matchbox4.price);
		System.out.println("Matchbox4 size:"+ matchbox4.size);
		System.out.println("Matchbox4 weight in gm:"+ matchbox4.weight);
		System.out.println("Matchbox4 type:"+ matchbox4.type);
		System.out.println("\n");
		Matchbox matchbox5=new Matchbox("Eagle", 100, 10,155D,"medium");
		System.out.println("Matchbox5 brand:"+ matchbox5.brand);
		System.out.println("Matchbox5 noOfSticks:"+ matchbox5.noOfSticks);
		System.out.println("Matchbox5 length in cm:"+ matchbox5.length);
		System.out.println("Matchbox5 price:"+ matchbox5.price);
		System.out.println("Matchbox5 size:"+ matchbox5.size);
		System.out.println("Matchbox5 weight in gm:"+ matchbox5.weight);
		System.out.println("Matchbox5 type:"+ matchbox5.type);
		System.out.println("\n");
		
		
		Matchbox matchbox6=new Matchbox("Eagle", 100, 10,15,"medium",155);
		System.out.println("Matchbox6 brand:"+ matchbox6.brand);
		System.out.println("Matchbox6 noOfSticks:"+ matchbox6.noOfSticks);
		System.out.println("Matchbox6 length in cm:"+ matchbox6.length);
		System.out.println("Matchbox6 price:"+ matchbox6.price);
		System.out.println("Matchbox6 size:"+ matchbox6.size);
		System.out.println("Matchbox6 weight in gm:"+ matchbox6.weight);
		System.out.println("Matchbox6 type:"+ matchbox6.type);
		System.out.println("\n");
	Matchbox matchbox7=new Matchbox("cooly", 100, 10,10,"medium",155,"red tip wood type");
		System.out.println("Matchbox7 brand:"+ matchbox7.brand);
		System.out.println("Matchbox7 noOfSticks:"+ matchbox7.noOfSticks);
		System.out.println("Matchbox7 length in cm:"+ matchbox7.length);
		System.out.println("Matchbox7 price:"+ matchbox7.price);
		System.out.println("Matchbox7 size:"+ matchbox7.size);
		System.out.println("Matchbox7 weight in gm:"+ matchbox7.weight);
		System.out.println("Matchbox7 type:"+ matchbox7.type);
		
		
		
	}
	
	
	
	
	
	
	
	
}