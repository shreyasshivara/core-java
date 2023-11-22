class CameraStarter{
	
	public static void main(String[] photo){
		
		System.out.println("Starting main in CameraStarter");
		
		
		HandCamera handCamera=new HandCamera(Colour.BLACK,6,1024);
		handCamera.setWeight(480d,"Canon");
		
		System.out.println("Ending main in CameraStarter");
	}
	
	
	
	
	
	
	
}