class LGRemote extends Remote{
	
	int warranty;
	int totalBatteries;
	
	LGRemote(RemoteUsedFor usedFor,int totalButtons,boolean origional,int warranty,int totalBatteries){
		super(usedFor,totalButtons,origional);
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
	
	}
	
	void voiceCommand(){
		System.out.println("Activating voiceCommand");
	}
	@Override
	void increaseVolume(){
		System.out.println("+ volume");
	}
	@Override
	void decreaseVolume(){
		System.out.println("- volume");
}
}