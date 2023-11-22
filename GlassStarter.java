class GlassStarter{
	
	public static void main(String[] Transparent){
		System.out.println("Starting main in GlassStarter");
		
		
		LaminatedGlass laminatedGlass = new LaminatedGlass(2);
	
		laminatedGlass.cost=100;
		laminatedGlass.length=7;
		
		ToughnedGlass toughnedGlass= new ToughnedGlass(2);
		ToughnedGlass toughnedGlass1= new ToughnedGlass(5, "Calvin Klein");
		toughnedGlass.ownerName= "Shreyas";
		toughnedGlass.setGlassType(GlassType.GORRILLGLASS, "Protection");
		System.out.println("Ending main in GlassStarter");
	}
	
	
}






