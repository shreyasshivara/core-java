class Tv{
	
	boolean display;
	Speaker speaker;
	
	Tv(boolean display,Speaker speaker){
	this.display=display;
	this.speaker=speaker; 
	}
	
	void ShowInfo()
	{
		System.out.println("Display is on?:"+ this.display);
		System.out.println("the speaker is :"+ this.speaker);
		System.out.println("The maximum volume is :"+ speaker.maxVolume);
		
		
		
	}
	
	
	
	
	

	
}