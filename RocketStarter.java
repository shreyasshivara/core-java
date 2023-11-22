class RocketStarter{
	public static void main (String []space)
	{
		System.out.println("Starting main in RocketStarter");
		Rocket rocket=new Rocket();
		System.out.println("Rocket type:"+ rocket.type);
		System.out.println("Rocket material:"+ rocket.material);
		System.out.println("Rocket weight in kg:"+ rocket.weight);
		System.out.println("Rocket length in meter:"+ rocket.length);
		System.out.println("\n");
		Rocket rocket1=new Rocket("liquid fuel");
		System.out.println("Rocket1 type:"+ rocket1.type);
		System.out.println("Rocket1 material:"+ rocket1.material);
		System.out.println("Rocket1 weight in kg:"+ rocket1.weight);
		System.out.println("Rocket1 length in meter:"+ rocket1.length);
		System.out.println("\n");
		Rocket rocket2=new Rocket("solid fuel", "titanium");
		System.out.println("Rocket2 type:"+ rocket2.type);
		System.out.println("Rocket2 material:"+ rocket2.material);
		System.out.println("Rocket2 weight in kg:"+ rocket2.weight);
		System.out.println("Rocket2 length in meter:"+ rocket2.length);
		System.out.println("\n");
		Rocket rocket3=new Rocket("liquid fuel", "aluminium", 16000);
		System.out.println("Rocket3 type:"+ rocket3.type);
		System.out.println("Rocket3 material:"+ rocket3.material);
		System.out.println("Rocket3 weight in kg:"+ rocket3.weight);
		System.out.println("Rocket3 length in meter:"+ rocket3.length);
		System.out.println("\n");
		Rocket rocket4=new Rocket("solid fuel", "titanium",16000, 80);
		System.out.println("Rocket4 type:"+ rocket4.type);
		System.out.println("Rocket4 material:"+ rocket4.material);
		System.out.println("Rocket4 weight in kg:"+ rocket4.weight);
		System.out.println("Rocket4 length in meter:"+ rocket4.length);
		System.out.println("\n");
		System.out.println("Ending main in RocketStarter");
	}
	
	
}