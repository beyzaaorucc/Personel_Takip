import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) {
		String depAd;
		int depNo,ds,ps,ss;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Departman sayýsýný giriniz:");
		ds=scan.nextInt();
		System.out.print(" ");
		
		
		Departman[] departmanlar=new Departman[ds];
		
		for(int i=0;i<ds;i++) {
			System.out.print(i+1+" . departman numarasýný giriniz:");
			depNo=scan.nextInt();
			System.out.print(i+1+" . departman adýný giriniz:");
			depAd=scan.next();
			Departman dep=new Departman(depNo,depAd);
			
			departmanlar[i]=dep;
			
			System.out.print("Personel sayýsýný giriniz");
		    int perSay=scan.nextInt();
		    Personel[] personeller = new Personel[perSay];
			for(int j =0; j<perSay; j++)
			{
				System.out.print(j+1+" . personel adýný giriniz:");	
				String perAd=scan.next();
				System.out.print(j+1+" . personel soyadýný giriniz:");
				String perSoyad=scan.next();
				System.out.print(j+1+" . personel yas giriniz:");
				int perYas=scan.nextInt();
		        Personel per=new Personel(depNo,j+1,perAd, perSoyad,perYas);
		        
		        personeller[j]=per;
			}
			dep.personeller= personeller;
			// servis bilgileri aliniyor
			System.out.print("Servis sayýsýný giriniz");
		    int serSay=scan.nextInt();
		    Servis[] servisler=new Servis[serSay];
			for(int k =0; k<serSay; k++)
			{
				System.out.print(k+1+" . güzergah adýný giriniz:");	
				String serGuzergah=scan.next();
				
		        Servis servis=new Servis(depNo,serGuzergah);
		        
		        servisler[k]=servis;
			
			}
			dep.servisler= servisler;
		}
		
		
		int secim=-1;
	while(secim!=6) 
	{
		
        System.out.println("*************MENU************");
        System.out.println("1-Tüm Departman Bilgilerini Listele");
        System.out.println("2-Departman Adýna Göre Arama Yap");
        System.out.println("3-Personel Adýna Göre Arama Yap");
        System.out.println("4-Servis Güzergahýna Göre Arama Yap");
        System.out.println("5-Yaþý En Büyük ve En Küçük Personel/Personelleri Bul");
        System.out.println("6-Çýkýþ");
        System.out.println("");
        System.out.println("Lütfen seçiminizi yapýnýz...");
       secim=scan.nextInt();

        

        switch (secim){

            case 1:

            	tumDepartmanBilgileriniListele(departmanlar);

                break;

            case 2:

                System.out.println("Departman adýný giriniz:");
                String depAdAra=scan.next();
                boolean kayitVarMi=false;

                for (Departman departman : departmanlar) {
					if(departman.getdepAd().equals(depAdAra))
					{
						kayitVarMi=true;
						System.out.println("Departman no: "+departman.getdepNo()+" Departman ad: "+departman.getdepAd());
					}
					
				}
                if(!kayitVarMi)
                {
                	System.out.println("Departman bulunamadý");
                }
        

                break;

            case 3:

            	 System.out.println("Personel adýný giriniz:");
                 String perAd=scan.next();
                 boolean perVarMi=false;
                 for (Departman departman : departmanlar) {
 					for (Personel personel : departman.personeller) {
						if(personel.getperAd().equals(perAd)) 
						{
							perVarMi=true;
							System.out.print("Departman no:"+departman.getdepNo()+"Departman ad:"+departman.getdepAd());
							System.out.print("Personel Ad: "+personel.getperAd()+" Soyad: "+personel.getperSoyad());

						}
					}
 					
 				}
                 if(!perVarMi)
                 {
                 	System.out.println("Personel bulunamadý");
                 }
         

                break;

             case 4:
            	 System.out.println("Servis güzergahý giriniz:");
                 String guzergah=scan.next();
                 boolean serVarMi=false;
                 for (Departman departman : departmanlar) {
 					for (Servis servis : departman.servisler) {
						if(servis.getSerGuz().equals(guzergah) ) 
						{
							serVarMi=true;
							System.out.print("Departman no:"+departman.getdepNo()+"Departman ad:"+departman.getdepAd());
							System.out.print("Güzergah: "+servis.getSerGuz());

						}
					}
 					
 				}
                 if(!serVarMi)
                 {
                 	System.out.println("Servis bulunamadý");
                 }
               

           

                 break;

             case 5:
                
                System.out.println("Yaþý  en büyük personel(ler):");
                Personel enBuyuk = departmanlar[0].personeller[0]; //varsayilan olarak ilk personel seciliyor
                
                for (Departman departman : departmanlar) {
 					for (Personel personel : departman.personeller) {
 						
 						if(enBuyuk.getperYas()>=personel.getperYas())
 						{
 							enBuyuk=personel;
 							
 						}
					}
 					System.out.print("Departman no:"+departman.getdepNo()+"Departman ad:"+departman.getdepAd());
					System.out.print("Personel Ad: "+enBuyuk.getperAd()+" Soyad: "+enBuyuk.getperSoyad());
                }
                
                
                System.out.println("Yaþý  en küçük personel(ler):");
                Personel enKucuk = departmanlar[0].personeller[0]; //varsayilan olarak ilk personel seciliyor
                
                for (Departman departman : departmanlar) {
 					for (Personel personel : departman.personeller) {
 						
 						if(enKucuk.getperYas()<=personel.getperYas())
 						{
 							enKucuk=personel;
 							
 						}
					}
 					System.out.print("Departman no:"+departman.getdepNo()+"Departman ad:"+departman.getdepAd());
					System.out.print("Personel Ad: "+enKucuk.getperAd()+" Soyad: "+enKucuk.getperSoyad());
                }

                 break;
           
             case 6:
            	 
            	 System.out.println("Ýþlem Soýnlandýrýldý. Seçim Yapamazsýnýz.");
            	 
            	 
            	 System.exit(-1);
            	 break;
           }

     }
		
     }

	private static void tumDepartmanBilgileriniListele(Departman[] departmanlar) {
		for (Departman departman : departmanlar) {
			System.out.println("Departman no: "+departman.getdepNo()+" Departman ad: "+departman.getdepAd());
			System.out.println("Personeller:");
			for (Personel pers : departman.personeller) {
				int perAdet=1;
				System.out.println(perAdet +". Personel:" +pers.getperAd() + " " +pers.getperSoyad() +" "+ pers.getperYas());
				perAdet++;
			}
			for (Servis ser : departman.servisler) {
				int serAdet=1;
				System.out.println(serAdet +". Servis:" +ser.getserID() + " " +ser.getSerGuz());
				serAdet++;
			}
		}
	}
	
	
}


