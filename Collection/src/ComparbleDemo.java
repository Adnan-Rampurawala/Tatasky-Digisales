 class ComparbleDemo implements Comparable<ComparbleDemo> {

	private int AccNo;
	private String HolderName;
	private String address;
	
	ComparbleDemo(int AccNo,String HolderName,String address){
		this.AccNo=AccNo;
		this.HolderName=HolderName;
		this.address=address;
	}
	public int getAccNo() {
		return AccNo;
	}

	public String getHolderName() {
		return HolderName;
	}

	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "ComparbleDemo AccNo=" + AccNo + ", HolderName=" + HolderName
				+ ", address=" + address ;
	}
	
//	@Override
//	public int compareTo(ComparbleDemo o) {
//		// TODO Auto-generated method stub
//		return this.AccNo-o.AccNo;
//	}
	
	@Override
	public int compareTo(ComparbleDemo comp) {
		// TODO Auto-generated method stub
		return this.HolderName.compareTo(comp.HolderName);
	}

}
