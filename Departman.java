

public class Departman {

	private int depNo;
	private String depAd; 
	
	public Personel[] personeller;
	public Servis[] servisler;
	
	public Departman(int depNo,String depAd) {
		this.depAd=depAd;
		this.depNo=depNo;
	}
	

	public void BilgiAl() {
		System.out.println("---------------------------------------");
		System.out.println("Departman adý:"+depAd);
		System.out.println("Departman no:"+depNo);
		
	}

	public int getdepNo() {
		return depNo;
	}
	public void setdepNo(int depNo) {
		this.depNo = depNo;
	}
	public String getdepAd() {
		return depAd;
	}
	public void setdepAd(String depAd) {
		this.depAd = depAd;
	}
	
	
}

   
	
	
	
	

