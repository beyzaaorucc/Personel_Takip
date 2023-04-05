
public class Servis{

	private int depNo;
	private int serID;
	private String servisGuzergah;
	private static int count=0;
	
	public Servis(int depNo, String serGuz) {
		
		this.serID=++count;
		this.servisGuzergah=serGuz;
		this.depNo=depNo;
	}
	
	
	
	
	
	public int getserID() {
		return serID;
	}
	public void setserID(int serID) {
		this.serID = serID;
	}
	
	public String getSerGuz() {
		return servisGuzergah;
	}
	public void setserGuz(String serGuz) {
		this.servisGuzergah = serGuz;
	}
    public int getDepNo() {
		return depNo;
	}
    public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
}
