class LapTop{
	
	HardWare[] hard;//set
	Owner owner;
	Brand brand;//const
 	
		LapTop(Brand brand){
			this.brand=brand;
			System.out.println("Created lapTop using Brand org const....");
		}
		void sethardWares(HardWare[] hard){
			this.hard=hard;
		}
	
		void laptopOwner(Owner owner){
		this.owner=owner;
	}
	void Show(){
		System.out.println("Starting show in LapTop");
		
		//hard.Show();
		if (this.hard!=null){
			for(int seq=0;seq<this.hard.length;seq++){
				HardWare ref=hard[seq];
				ref.Show();
				owner.Show();
		brand.Show();
			}
		}
		
		System.out.println("Ending show in LapTop");
		
	
	}
}