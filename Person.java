class Person{
	 
	 String name= "Shreyas"; //lit
	 Email[] email;// const
	
	Person( Email[] email){
		System.out.println("Created Email[] -arg const...");
		this.email=email;
	}
	
	
	
	void ShowInfo(){
		System.out.println("Starting ShowInfo in Person");
		System.out.println("name is :"+ this.name);
		System.out.println("emails is:"+ this.email);
		if (this.email!=null){
			System.out.println("length:"+ this.email.length);
			for (int seq=0; seq<this.email.length; seq++){
				Email ref =this.email[seq];
				ref.ShowInfo();
				System.out.println("email:"+ ref);
			}
		}
		
		
		System.out.println("Ending ShowInfo in Person");
		
	}
 	
	
}