class Carrom{
	
	int noOfpons;
	String material;
	double cost;
	int noOfPlayers;
	int noOfPouch;
	
	Carrom()
	{
		System.out.println("Created Carrom");
	}
	Carrom(int noOfpons){
		this.noOfpons=noOfpons;
	}
	Carrom(int noOfpons,String material){
		this(noOfpons);
		this.material=material;
	}
	Carrom(int noOfpons,String material,double cost){
		this(noOfpons,material);
		this.cost=cost;
	}
	Carrom(int noOfpons,String material,double cost,int noOfPlayers){
		this(noOfpons,material,cost);
		this.noOfPlayers=noOfPlayers;
	}
	Carrom(int noOfpons,String material,double cost,int noOfPlayers,int noOfPouch){
		this(noOfpons,material,cost,noOfPlayers);
		this.noOfPouch=noOfPouch;
	}
	
	
	
	
	
	
	
}