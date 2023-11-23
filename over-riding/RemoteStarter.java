class RemoteStarter{
	
	public static void main(String[] control)
	{
		
		System.out.println("Starting main in RemoteStarter");
		
		Remote remote=new Remote(RemoteUsedFor.TV,30,true);
		System.out.println("total buttons:"+ remote.totalButtons);
		System.out.println("origional?:"+ remote.origional);
		System.out.println("used for:"+ remote.usedFor);
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.on();
		remote.off();
		remote.changeChannel();
		
		
		LGRemote lGRemote=new LGRemote(RemoteUsedFor.AC,25,true,2,2);
		System.out.println("total buttons:"+ lGRemote.totalButtons);
		System.out.println("origional?:"+ lGRemote.origional);
		System.out.println("used for:"+ lGRemote.usedFor);
		
		System.out.println("The warranty is :"+ lGRemote.warranty +"yrs");
		System.out.println("total batteries:"+ lGRemote.totalBatteries);
		
		lGRemote.voiceCommand();
		lGRemote.increaseVolume();
		lGRemote.decreaseVolume();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Ending main in RemoteStarter");
	}	
	
	
	
	
	
	
	
	
	
	
}