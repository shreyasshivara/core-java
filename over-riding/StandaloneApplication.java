class StandaloneApplication extends Application{
	
	int size;
	String compatableWith;
	ApplicationOS os;
	
	StandaloneApplication(){
		
	}
	StandaloneApplication(int size,String compatableWith,ApplicationOS os,long id,String name,ApplicationType type,String version,String developer,String date){
		super(id,name,type,version,developer,date);
		this.size=size;
		this.compatableWith=compatableWith;
		this.os=os;
	}
	void consumeerMemory(){
		System.out.println("consumeerMemory");
	}
	void consumeInternet(){
		System.out.println("consumeInternet");
	}
	
	
}