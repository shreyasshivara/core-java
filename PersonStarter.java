class PersonStarter{
	
	public static void main(String[] start){
		System.out.println("Starting main in PersonStarter");
		Person person=new Developer();
		Developer developer1=new Tester();
		Person person1=new BusinessAnalyst();
		Person person2=new ProductOwner();
		Developer developer2=new DataBaseDeveloper();
		Person person3=new Devops();
		Project project=new Project();
		
		project.validate(developer1);
		project.validate(person1);
		project.validate(person2);
		project.validate(developer2);
		project.validate(person3);
		System.out.println("Ending main in PersonStarter");
	}
	
	
	
}