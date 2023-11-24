class Application{
	
	long id;
	String name;
	ApplicationType type;
	String version;
	String developer;
	String date;
	
	
	
	
	Application(){
		
	}
	Application(long id,String name,ApplicationType type,String version,String developer,String date){
		this.id=id;
		this.name=name;
		this.type=type;
		this.version=version;
		this.developer=developer;
		this.date=date;
	}
	
	void run(){
		System.out.println("run");
		
	}
	void stop(){
		System.out.println("stop");
	}
	void execute(){
		System.out.println("execute");
	}
	void collectInfo(){
		System.out.println("collectInfo");
	}
	void displayInfo(){
		System.out.println("displayInfo");
	}
	
	
}