class Bracelet{
	
	String material;
	double cost;
	double weight;
	double length;
	String madeIn;
	
	Bracelet(){
		System.out.println("Created bracelet");
	}
	Bracelet(String material){
		this.material=material;
	}
	Bracelet(String material,double cost){
		
		this(material);
		this.cost=cost;
	}
	Bracelet(String material,double cost,double weight){
		
		this(material, cost);
		this.weight=weight;
	}
	Bracelet(String material,double cost,double weight, double length){
		
		this(material, cost, weight);
		this.length=length;
	}
	
	Bracelet(String material,double cost,double weight, double length, String madeIn){
		
		this(material, cost, weight, length);
		this.madeIn=madeIn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}