class Browser extends StandaloneApplication{
	
	String[] downloads;
	String[] browsingHistoriesItems;
	
	
	
	Browser(){
		
	}
	Browser(String[] downloads,String[] browsingHistoriesItems,int size,String compatableWith,ApplicationOS os,long id,String name,ApplicationType type,String version,String developer,String date){
		super(size,compatableWith,os,id,name,type,version,developer,date);
		this.downloads=downloads;
		this.browsingHistoriesItems=browsingHistoriesItems;
		
			}
		
	
	void settings(){
		System.out.println("settings");
	}
	void displayHistory(){
		System.out.println("displayHistory");
	}
	void show(){
		if(downloads!=null){
			for (int seq=0;seq<downloads.length;seq++)
				System.out.println("downloads:"+this.downloads[seq]);
		}
		if(browsingHistoriesItems!=null){
			for (int seq=0;seq<browsingHistoriesItems.length;seq++)
				System.out.println("browsingHistoriesItems:"+this.browsingHistoriesItems[seq]);
		}
		
	}
	
	
	
	
	
	
	
	
}