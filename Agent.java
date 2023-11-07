class Agent{

	int id=1;
	String name= "Shreyas";
	String company= "coleman";
	Tent tent;
	
	void openTent(Tent tent){
		this.tent=tent;
		System.out.println("the slno is :"+ tent.slno);
		System.out.println("The width is:"+tent.width);
		System.out.println("The hight is:"+tent.hight);
		tent.open();
		
	}
	void closeTent(Tent tent){
		this.tent=tent;
		System.out.println("the slno is :"+ tent.slno);
		System.out.println("The width is:"+tent.width);
		System.out.println("The hight is:"+tent.hight);
		tent.close();
		
	}
void ShowIjavanfo(){
	
	System.out.println("Starting Showinfo in agent"); 
	openTent(tent);
	closeTent(tent);
	
	System.out.println("The id is :"+id); 
	
	System.out.println("Ending Showinfo in agent"); 
	
	
	
}


}