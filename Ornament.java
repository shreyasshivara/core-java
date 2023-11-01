class Ornament{
	
	String type;
	String material;
	double weight;
	double cost;
	
	
	Ornament(){
		super();
		System.out.println("Ornament created");
		
	}
	Ornament(String type){
		super();
		this.type=type;
	}
	Ornament(String type,String material){
		super();
		this.type=type;
		this.material=material;
	}
	Ornament(String type,String material,double weight){
		super();
		this.type=type;
		this.material=material;
		this.weight=weight;
	}
	Ornament(String type,String material,double weight,double cost){
		super();
		this.type=type;
		this.material=material;
		this.weight=weight;
		this.cost=cost;
	}
	
	
	
	
	
	
	
	
}