class RemoteStarter{
	
	public static void main(String[] control)
	{
		
		System.out.println("Starting main in RemoteStarter");
		
		Remote remote=new LGRemote(RemoteUsedFor.TV,30,true);
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.on();
		remote.off();
		remote.changeChannel();
		
		
		LGRemote lGRemote=new LGRemote(2,2);
		lGRemote.voiceCommand();
		lGRemote.increaseVolume();
		lGRemote.decreaseVolume();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Ending main in RemoteStarter");
	}	
	
	
	
	
	
	
	
	
	
	
}