class CompanyJob{
	
	public static void main (String []work)
	{
		System.out.println("Starting main in CompanyJob");
		
		Job job =new Job();
		Company company=new Company(job);
		
		
		company.ShowInfo();
		
		System.out.println("Ending main in CompanyJob");
	}
	
	
	
	
	
	
	
}