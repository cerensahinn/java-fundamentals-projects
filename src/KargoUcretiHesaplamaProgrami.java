import java.util.Scanner;

public class KargoUcretiHesaplamaProgrami {

	public static void main(String[] args) {
    
		
		System.out.println("KARGO ÜCRETİ HESAPLAMA SİSTEMİ");
		
		System.out.print("\n Kargo Firması Seçiniz:");
		System.out.println("\n1- Aras Kargo (100 TL Taban Ücreti)"+
		"\n2- MNG Kargo (120 TL Taban Ücreti)"+
		"\n3- Yurtiçi Kargo (135 TL Taban Ücreti)");
		
		Scanner input=new Scanner(System.in);
		
      int kargofirmasi =input.nextInt();
      
      double tabanUcret=0;
      String firmaAdi="";
      
      switch(kargofirmasi) {
      case  1: 
    	  tabanUcret=100;
    	  firmaAdi="Aras Kargo";
    	  break;
      case 2: 
    	  tabanUcret=120;
    	  firmaAdi="MNG Kargo";
    	  break;
      case 3:
    	  tabanUcret=135;
    	  firmaAdi="Yurtiçi Kargo";
    	  break;
    	  default:
    		  System.out.println("Geçersiz Firma Girdiniz.");
          return;
      }
      
      System.out.print("\nServis Tipini Seçiniz:");
      System.out.println("\n1-Standart (Çarpanı: 1.0)"+
      "\n2-Express (Çarpanı: 1.35)"+
      "\n3-Aynı Gün Teslimat (Çarpanı: 1.60)");
      
       int servisTipi=input.nextInt();
       
       Double servisCarpani= 0.0;
       String servisAdi="";
       
       switch(servisTipi) {
       case 1:
    	   servisCarpani=1.0;
    	   servisAdi="Standart";
    	   break;
       case 2:
    	   servisCarpani=1.35;
    	   servisAdi="Express";
    	   break;
       case 3:
    	   servisCarpani=1.60;
    	   servisAdi="Aynı Gün Teslimat";
    	   break;
       default:
    	   System.out.println("Geçersiz Servis Tipi Girdiniz.");
    	   return;
    	   
       }   
    	   
    	   System.out.print("\n Kargo Ağırlığını kg Cinsinden Yazınız.");
    	   
    	   double kargoAgirligi =input.nextDouble();
    	   
    	   double kgUcreti=7.5;
    	   double agirlikUcreti=kgUcreti*kargoAgirligi;
    	   
    	   if (kargoAgirligi<0) {
			System.out.println("Negatif Değer Olamaz"); return;
		}
    	   
    	   if (kargoAgirligi>50 && kargoAgirligi<80) {
			
    		  agirlikUcreti+=90;}
    	   
    		  
    	  else if (kargoAgirligi>=80 && kargoAgirligi<100)  {
    			  
    		 agirlikUcreti+=130;}
    		  
    	 else if (kargoAgirligi>=100) {
    			  
    		 agirlikUcreti+=300;}
    	   
    	 else {
			 agirlikUcreti+=0;
			}
    		  
    	   System.out.print("\nKargonun Gideceği Mesafeyi Km Cinsinden Giriniz:");
    	   
    	   double mesafe=input.nextDouble();
 
    	   double mesafeucreti= mesafe*5;
    	   
    	   if (mesafe<0) {
			System.out.println("Negatif Değer Olamaz."); return;
		}
    	   
    	   if(mesafe>100 && mesafe<500) {
    		   
    		   mesafeucreti+=150;
    	   }
    	   else if(mesafe>=500 && mesafe<1000) {
    		   
    		   mesafeucreti+=250;
    	   }
    	   
    	   else if(mesafe>=1000) {
    		   
    		   mesafeucreti+=550;
    	   }
    	   
    	   else {
			mesafeucreti+=0;
		}
    	   
    	   
    	   
    	   System.out.println("\nToplam Ödemeniz Gereken Kargo Tutarı: " +
    	   (tabanUcret+agirlikUcreti+mesafeucreti)*servisCarpani + "TL");
    	   
    	  
    	   
	}	  
}



    	   
  	   
      
       
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
		
		

