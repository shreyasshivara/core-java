class MediaPlayer extends StandaloneApplication{
	
	String[] fevorites;
	
	MediaPlayer(){
		
	}
	MediaPlayer(String[] fevorites){
		this.fevorites=fevorites;
		if (this.fevorites!=null){
		for(int seq=0;seq<fevorites.length;seq++){
			System.out.println("fevorites:"+this.fevorites[seq]);
			}
		}
		}
	
	void play(){
		System.out.println("play");
	}
	void delete(){
		System.out.println("delete");
	}
	void download(){
		System.out.println("downloadd");
	}
	void show(){
		
		}
		
	
	
}