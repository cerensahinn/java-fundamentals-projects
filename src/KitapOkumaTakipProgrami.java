import java.util.Scanner;

public class KitapOkumaTakipProgrami {

	public static void main(String[] args) {

		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("TAKİP PROGRAMINA HOŞGELDİNİZ.."+
		"\n Lütfen Ad Soyad Bilginizi Giriniz:");
		
		String adSoyad=inputScanner.nextLine();
		
		int gunsayisi=7;
		int OkunanSayfa;
		int bosZaman;
		int hedef;
		int basariSayaci=0;
		do
		{
					System.out.println("Lütfen Günlük Boş Zamanınızı (Saat) Giriniz:");
					bosZaman=inputScanner.nextInt();
					
					if (bosZaman<=0)
					{
						System.out.println("Boş Zamanınız 0 veya Negatif Olamaz. Tekrar Deneyin.");
					}			
		}
		while(bosZaman<=0);
			
		           if (bosZaman>0 && bosZaman<=4)
		           {
		        	   hedef=50;
					System.out.println("Günlük Sayfa Hedefiniz: " +hedef );
				   }
		           else if (bosZaman>4 && bosZaman<8) 
		           {
		        	   hedef=90;
					System.out.println("Günlük Sayfa Hedefiniz: "+hedef);
				   }
		           else 
		           {
					hedef=130;
					System.out.println("Günlük Sayfa Hedefiniz: "+hedef);
				   }
		
		
		  for(int gun = 1;  gun<=gunsayisi; gun++ )
		  {
			  while(true)
			  {
				  System.out.println("Lütfen Okuduğunuz Sayfa Sayısını Giriniz:");
			      OkunanSayfa=inputScanner.nextInt();
			      
			      if (OkunanSayfa>1000)
			      {
					System.out.println("Lütfen Gerçekçi Bir Sayı Giriniz.");
					continue;
			   	  }
			  
				  if (OkunanSayfa<=0) 
				  {
					System.out.println(gun + ". Gün Hiç Kitap Okumadınız ve Hedefi Gerçekleştiremediniz.");
					break;
				  }
				  else if (OkunanSayfa<hedef) 
				  {
				 	System.out.println(gun+ ". Gun Hedefin Altında Kaldınız");
				 	break;
				  }
				  else if (OkunanSayfa==hedef) 
				  {
					System.out.println(gun+".Gun Tebrikler Hedefinizi Gerçekleştirdiniz.");
					break;
				  }
				  else if (OkunanSayfa>hedef)
				  {
					System.out.println(gun+ ". Gun Brova Güzel Bir Başarı Yakaladınız ve Hedefinizin Üstüne Çıktınız");
					basariSayaci++;
					if (basariSayaci==4) 
					{
						System.out.println(" " +basariSayaci+ ". Kez Hedef üstü performans"
								+ " Gösterdiniz ve Bizden 1 Kitap ve 1 Ayraç Hediyesi Kazandınız");
					}
					break;
				  }
			  }//while kapatma
		  }// for kapatma
		  
		  
		
		
		
		
	}

}


















































































