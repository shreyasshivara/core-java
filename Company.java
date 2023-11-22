class Company{
	
	String name= "Infosys";
	String gstNo= "GSTIN000232";
	String location= "Mysore";
	Job job;
	
	Company(Job job){
		
		this.job=job;
	}
	void ShowInfo(){
		
		System.out.println("The company name is :"+this.name);
		System.out.println("The gst number is :"+ this.gstNo);
		System.out.println("The location is :"+ this.location);
		System.out.println("The job is :"+ this.job);
		System.out.println("The role is :"+job.role);
		System.out.println("Salary is :"+ job.salary);
		System.out.println("type:"+ job.type);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}