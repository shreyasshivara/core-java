class Project{
	
	void validate(Person person){
		
		
		if(person!=null){
			if(person instanceof Developer){
		Developer developer=(Developer)person;
		developer.eat();
		developer.sleep();
		developer.code();
		}
		
		if(person instanceof Tester){
		Tester tester=(Tester)person;
		tester.code();
		tester.qualityCheck();
		}
		
		if(person instanceof BusinessAnalyst){
		BusinessAnalyst businessAnalyst=(BusinessAnalyst)person;
		businessAnalyst.eat();
		businessAnalyst.sleep();
		businessAnalyst.checkRequirement();
		}
		
		if(person instanceof ProductOwner){
		ProductOwner productOwner =(ProductOwner)person;
		productOwner.eat();
		productOwner.sleep();
		productOwner.validate();
		}
		
		if(person instanceof DataBaseDeveloper){
		DataBaseDeveloper dataBaseDeveloper=(DataBaseDeveloper)person;
		dataBaseDeveloper.code();
		dataBaseDeveloper.runScript();
		}
		if(person instanceof Devops){
		Devops devops=(Devops)person;
		devops.eat();
		devops.sleep(); 
		devops.runBuild();
		}
		
		
		
		System.out.println("Ending main in project");
		}
	}
	}
	
	
	
	
	
	
	
