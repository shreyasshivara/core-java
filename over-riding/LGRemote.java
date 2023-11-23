class LGRemote extends Remote{
	
	int warranty;
	int totalBatteries;
	
	LGRemote(int warranty,int totalBatteries){
		
		System.out.println("The warranty is :"+ warranty +"yrs");
		System.out.println("total batteries:"+ totalBatteries);
	}
	LGRemote(RemoteUsedFor usedFor,int totalButtons,boolean origional){
		System.out.println("usedfor:"+usedFor);
		System.out.println("Total buttons:"+ totalButtons);
		System.out.println("origional?:"+origional);
	}
	void voiceCommand(){
		System.out.println("Activating voiceCommand");
	}
	void increaseVolume(){
		System.out.println("+ volume");
	}
	void decreaseVolume(){
		System.out.println("- volume");
}
}