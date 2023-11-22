class TvSpeaker{

public static void main(String []movie)
{
	System.out.println("starting main in TvSpeaker");
	
	Speaker speaker=new Speaker(100);
	Tv tv=new Tv(true,speaker);
	
	
	tv.ShowInfo();
	System.out.println("Ending main in TvSpeaker");
	
	
}



}