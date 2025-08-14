import java.util.Scanner;

public class ATMSifreDogrulamaVeIslemMenusu {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);

		int sifre=7890;
		final int  HAK=3;
		int kalanhak=HAK;
		int girilensifre;
		
		do {
			System.out.println("\nLütfen Kart Şifrenizi Giriniz: ");
			 girilensifre=input.nextInt();
			
			if (girilensifre!=sifre) 
			{
				 kalanhak--;
				 System.out.println("Yanlış Şifre Girişi! "+ " Kalan Şifre Giriş  Hakkınız: " + kalanhak);
			}
			
			if (kalanhak==0)
			{
				System.out.println("Kartınız Bloke Edilmiştir.");
				return; //programı sonlanır.
			}
			
		}
		
		while(girilensifre != sifre && kalanhak>0);
		
		      System.out.println("\nHoşgeldiniz.Lütfen Menüden Yapmak İstediğiniz İşlemi Seçiniz.");
		
		double bakiye=1000;
		
		other:
		while(true)
		{
			System.out.println("\n --İŞLEM MENÜSÜ--" +
		"\n1- Para Çekme "+
		"\n2- Para Yatırma" +
		"\n3- Bakiye Görüntüleme");
			int secim=input.nextInt();
			
			if (secim<1|| secim>3) 
			{
				System.out.println("Geçersiz Seçim Yaptınız.Lütfen Tekrar Seçim Yapınız");
				continue;
			}
			switch(secim) 
			{
			case 1: System.out.println("Lütfen Çekmek İstediğiniz Tutarı Giriniz:");
			double cekilen=input.nextDouble();
			if (cekilen>bakiye) 
			{
				System.out.println("Yetersiz Bakiye! İşleminiz Reddedildi.");
			}
			else if (cekilen<=0) 
			{
				System.out.println("Geçersiz Bir Tutar Girdiniz: ");
			}
			else 
			{
				bakiye-=cekilen;
				System.out.println("Para Çekme İşleminiz Tamamlandı.Kalan Bakiyeniz: "+bakiye+ " TL" );
			}
			
			break;
			
			case 2: System.out.println("Lütfen Yatırmak İstediğiniz Tutarı Giriniz:");
			double yatirilan=input.nextDouble();
			
			if(yatirilan<=0)
			{
				System.out.println("Geçersiz Bir Tutar Girdiniz");
				break;
			}
			else 
			{
				bakiye+=yatirilan;
				System.out.println("Para Yatırma İşleminiz Tamamlandı.Güncel Bakiyeniz: "+bakiye+ " TL");
				break;
			}
			
			case 3: System.out.println("Güncel Bakiyeniz: " + bakiye + " TL");
			break;
			
			}
			
			
			while(true)
			{
				System.out.println("Başka İşlem Yapmak İster misiniz? (Evet ise 1 Hayır ise 0) ");
				int karar=input.nextInt();
				if (karar==1) 
				{
					 continue other;
				}
				
				else if (karar==0) 
				{
					System.out.println("İyi Günler Dileriz.");
					break other ;
				}
				
				else 
				{
					System.out.println("Geçersiz Giriş Yaptınız. Lütfen Hayır için 0 Evet için 1 girin. ");
				}
				
			}
		
		}
	
	}

}


















































































