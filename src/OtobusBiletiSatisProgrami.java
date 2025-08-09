import java.util.Scanner;

public class OtobusBiletiSatisProgrami {

	public static void main(String[] args) {

		
		String adSoyad;
		int yas,yolculukTipi;
		double mesafe,biletFiyati;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Lütfen Ad Soyad Bilginizi Giriniz: ");
		adSoyad=input.nextLine();
		System.out.println("Lütfen Yaş Bilginizi Giriniz: ");
		yas=input.nextInt();
		System.out.println("Lütfen Yolculuk Tipinizi Giriniz (1:Tek Yön , 2:Gidiş-Dönüş): ");
        yolculukTipi=input.nextInt();
        System.out.println("Lütfen Yolculuk Mesafenizi KM Cinsinden Giriniz :");
        mesafe=input.nextDouble();
        
      
        
        if (yas<=0) 
        {
			System.out.println("Geçersiz Bir Yaş Değeri Girdiniz. ");
		}
        
        else if (yolculukTipi != 1 && yolculukTipi !=2)
        
        {
        	System.out.println("Geçersiz Bir Yolculuk Tipi Girdiniz. ");
        }
        
        else if (mesafe<=0)
        {
        	System.out.println("Geçersiz Bir Mesafe Girdiniz. ");
        }
        
        else
        {
			System.out.println("***");
		}
        
        System.out.println("Merhaba " +adSoyad);
        
        biletFiyati= (mesafe *0.10);
        double indirimliFiyat1 = biletFiyati- (biletFiyati*0.5);
        double indirimliFiyat2 = biletFiyati-(biletFiyati*0.3);
        double indirimliFiyat3= biletFiyati-(biletFiyati*0.6);
        double ciftYonİndirim1=(indirimliFiyat1*2)*0.90; 
        double ciftYonİndirim2=(indirimliFiyat2*2)*0.90;
        double ciftYonİndirim3=(indirimliFiyat3*2)*0.90;

        
        
        if (yas< 12) 
        {
			System.out.println( " \nUygulanan İndirim Sonucu Tek Yön için Ödemeniz Gereken Ücret = " + indirimliFiyat1 +"TL");
		
           if(yolculukTipi==2)
           {
           System.out.println("\nÇift Yön İçin Ek İndirimlerle Ödemeniz Gereken Toplam Ücret =" + ciftYonİndirim1 + "TL"  );
           }
        }
           else if (yas<=24)
           {
        	   System.out.println("\n Uygulanan İndirim Sonucu Tek Yön için Ödemeniz Gereken Ücret = " + indirimliFiyat2);
           
              if (yolculukTipi==2) 
              {
            	  System.out.println("\nÇift Yön İçin Ek İndirimlerle Ödemeniz Gereken Toplam Ücret =" + ciftYonİndirim2 + "TL"  );
              }
           }
           
              else if (yas>=65)
          {
      			System.out.println( " \nUygulanan İndirim Sonucu Tek Yön için Ödemeniz Gereken Ücret = " + indirimliFiyat3 +"TL");

              
              if (yolculukTipi==2) 
              {
            	  System.out.println("\nÇift Yön İçin Ek İndirimlerle Ödemeniz Gereken Toplam Ücret =" + ciftYonİndirim3 + "TL"  );
              } 
              
          }
            	    
              else 
              {
				System.out.println("Tek Yön İçin Ödemeniz Gereken Ücret = " +biletFiyati);
			   
            	  
            	  if (yolculukTipi==2)
            	  {
                	  System.out.println("\nÇift Yön İçin Ek İndirimlerle Ödemeniz Gereken Toplam Ücret =" + (biletFiyati*2) + "TL"  );

				 }
              }
            	  
            	  
            	  
            	  
            	  
            	  
}
             

}













































































