class PersonEmail{
	
	public static void main(String [] details){
		
		System.out.println("Starting main in PersonEmail");
		
		
		
		Email email=new Email[3];
		 email[0]=new Email("shreyasgowdasc@gmail.com");
		 email[1]=new Email("Shreyas@gmail.com");
		 email[2]=new Email("gowda@gmail.com");
		 Person person= new Person(email);
		 
		email.setId(1);
		System.out.println("\n");
				
		
		email.ShowInfo();
		System.out.println("\n");
		
		person.ShowInfo ();
		System.out.println("\n");
		
		System.out.println("Ending main in PersonEmail");
		
	}

	
	

	
}