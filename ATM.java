class ATM{
	String bankName;
	String[] branch;
	String[] acs;
	String[] ccTvBrands;
	
	void BankName(String bankName)
	{
	this.bankName=bankName;
	}
	void Branch(String[] branch)
	{
		this.branch=branch;
	}
	void ACS(String[] acs)
	{
		this.acs=acs;
	}
	void CCTVBrands(String[] ccTvBrands)
	{
		this.ccTvBrands=ccTvBrands;
	}
	void Show()
	{
		System.out.println("Starting Show in ATM");
		System.out.println("The bank name is:"+this.bankName);
		System.out.println("The branch is :"+this.branch);
		if(this.branch!=null){
			for(int Seq=0;Seq<this.branch.length;Seq++){
				String ref=branch[Seq];
				System.out.println("The branch in:"+ ref);
			
			}
		}
		System.out.println("The acs is:"+this.acs);
		if (this.acs!=null){
			for(int seq=0;seq<this.acs.length;seq++){
				String ref=acs[seq];
				System.out.println("The ac brand is:"+ ref);
			
			}
		}
		System.out.println("The cctvBrand is:"+this.ccTvBrands);
		if (this.ccTvBrands!=null){
			for(int seq=0;seq<this.ccTvBrands.length;seq++){
				String ref=ccTvBrands[seq];
				System.out.println("The cctv brand is:"+ ref);
				
		
	}
	
	
	
	
		}
		System.out.println("Ending Show in ATM");
}
}