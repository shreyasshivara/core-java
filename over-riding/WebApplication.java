class WebApplication extends Application{
	
	String[] supportedBrowsers;
	boolean free;
	
	WebApplication(){
		
	}
	WebApplication(String[] supportedBrowsers,boolean free){
		this.supportedBrowsers=supportedBrowsers;
		this.free=free;
		
		if(supportedBrowsers!=null){
			for(int seq=0;seq<supportedBrowsers.length;seq++){
				String ref=supportedBrowsers[seq];
				
			}
		
		}
		
	}
	
	void connectInternet(){
		System.out.println("connectInternet");
	}
	
	void sendUsage(){
		System.out.println("sendUsage");
	}
	void show(){
		if(this.supportedBrowsers!=null){
			for(int seq=0;seq<supportedBrowsers.length;seq++)
			System.out.println("supportedBrowsers;"+this.supportedBrowsers[seq]);
			System.out.println("free?:"+this.free);
		}
		
		
		
		
		
	}
	
	
}