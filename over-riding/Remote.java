class Remote{
	RemoteUsedFor usedFor;
	int totalButtons;
	boolean origional;
	
	Remote(){
		
	}
	Remote(RemoteUsedFor usedFor,int totalButtons,boolean origional){
		this.usedFor=usedFor;
		this.totalButtons=totalButtons;
		this.origional=origional;
		
	}
	void on(){
		System.out.println("Welcome");
		
	}
	void off(){
		System.out.println("shutting down");
	}
	void increaseVolume(){
		System.out.println("increasing volume");
	}
	void decreaseVolume(){
		System.out.println("decreasing volume");
	}
	void changeChannel(){
		System.out.println("changing channel");
	}
	
	
	
	
}