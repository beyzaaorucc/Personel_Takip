
public class Personel{
     
	    private int depNo;
        private int pID;
		private String perAd;
		private String perSoyad;
        private int perYas;
        private static int count=0;
        
        public Personel (int depNo, int perId, String ad, String soyad, int yas)
        {
        	this.depNo=depNo;
        	this.pID= perId;
        	this.perAd=ad;
        	this.perSoyad=soyad;
        	this.perYas = yas;
        }
        
		public int getpID() {
			return pID;
		}
		public void setpID(int pID) {
			this.pID = pID;
		}
		public String getperAd() {
			return perAd;
		}
		public void setperAd(String perAd) {
			this.perAd = perAd;
		}
		public String getperSoyad() {
			return perSoyad;
		}
		public void setperSoyad(String perSoyad) {
			this.perSoyad = perSoyad;
		}
		public int getperYas() {
			return perYas;
		}
		public void setperYas(int perYas) {
			this.perYas = perYas;
		}
		public int getPersonelSayisi()
		{
			return count;
		}
		
	}


