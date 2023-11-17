class Email{
	
	String domain= "Gmail";//lit
	int id;//set
	String firstName="Shreyas";//lit
	String lastName="Chandrashekara";//lit
	
	
	Email(){
		
		System.out.println("Created Email using no arg const...");
	}
	void setId(int id){
		this.id=id;
	}
	
	void ShowInfo(){
		System.out.println("Starting ShowInfo in Email");
		System.out.println("The domain is:"+ this.domain);
		System.out.println("The id is :"+ this.id);
		System.out.println("The firstname is :"+ this.firstName);
		System.out.println("The lastName is :"+ this.lastName);
		
		System.out.println("Ending ShowInfo in Email");
	}
}