import java.util.Scanner;

public class AkilliHarcamaVeButceTakipProgrami {

	public static void main(String[] args) {
 
		
		
		double aylikGelir,kiraGideri,yiyecekGideri,eglenceGideri,ulasimGideri,toplamHarcama,KalanGelir;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bütçe Takip Programına Hoşgeldiniz :) ");
		
		System.out.println("Lütfen Aylık Gelirinizi Giriniz: ");
		
		aylikGelir=input.nextDouble();
		
		System.out.println("Lütfen Aylık Kira Giderinizi Giriniz: ");
		
		kiraGideri=input.nextDouble();
		
		System.out.println("Lütfen Aylık Yiyecek Giderinizi Giriniz: ");
		
		yiyecekGideri=input.nextDouble();
		
		System.out.println("Lütfen Aylık Eğlence Giderinizi Giriniz: ");
		
		eglenceGideri=input.nextDouble();
		
		System.out.println("Lütfen Aylık Ulaşım Giderinizi Giriniz: ");
		
		ulasimGideri=input.nextDouble();
		
		
		toplamHarcama=kiraGideri+yiyecekGideri+eglenceGideri+ulasimGideri;
		
		KalanGelir= aylikGelir-toplamHarcama;
		
		
		if (toplamHarcama>aylikGelir) 
		{
			System.out.println("Bu Ay Harcamanız " + toplamHarcama+ "TL " + 
		" Elinize Kalan Toplam "+ KalanGelir+ "TL"
		+ "Bütçe Açığınız Var Çok Dikkatli Olmalısınız !!" );
		}
		
		else if (toplamHarcama==aylikGelir)
		{
			System.out.println("Bu Ay Harcamanız " +toplamHarcama+ "TL" + 
		"Geliriniz ve Gideriniz Dengede Ancak Yatırım Yapabilmek İçin Daha Dikkatli Olmalısınız. ");
		}
		
				else
				{
					System.out.println(" Tebrikler Bu Ay Sizin İçin İyi Geçmiş Görünüyor" +
				" Elinize Kalan Toplam " +KalanGelir + "TL" + " Yatırımınıza Devam Edebilirsiniz.");
				}
		
		
		double kiraYuzde=(kiraGideri/aylikGelir)*100;
		double yiyecekYuzde=(yiyecekGideri/aylikGelir)*100;
		double eglenceYuzde=(eglenceGideri/aylikGelir)*100;
		double ulasimYuzde=(ulasimGideri/aylikGelir)*100;
		double kalanyuzde=(KalanGelir/aylikGelir)*100;
		
		if (kiraYuzde>= 45) 
		{
			System.out.println("Kira Gideriniz  Aylık Gelirinizin Yüzde " +kiraYuzde + "'Sini Oluşturuyor.Bu Çok Yüksek Bir Oran");
		}
		
		else if (yiyecekYuzde>= 20) 
		{
			System.out.println("Yiyecek Gideriniz  Aylık Gelirinizin Yüzde " +yiyecekYuzde + "'Sini Oluşturuyor.Bu Çok Yüksek Bir Oran");
		}		
		
		else if (eglenceYuzde>= 15) 
		{
			System.out.println("Eğlence  Gideriniz  Aylık Gelirinizin Yüzde " +eglenceYuzde + "'Sini Oluşturuyor.Bu Çok Yüksek Bir Oran");
		}		
		
		else if (ulasimYuzde>= 8) 
		{
			System.out.println("Ulaşım  Gideriniz  Aylık Gelirinizin Yüzde " +ulasimYuzde + "'Sini Oluşturuyor.Bu Çok Yüksek Bir Oran");
		}		
		
		else if (kalanyuzde <5) 
		{
			System.out.println("  Aylık Gelirinizin Sadece  Yüzde " +kalanyuzde + "'Sini Yatırım İçin Ayırabilmişsiniz. Bu Çok Düşük Bir Oran");
		}		
		
		else
		{
			System.out.println("Tebrikler Bu Ay Harcamalarınız Oldukça Dengeli Görünüyor." +
		" Gelirinizin Yüzde " +kalanyuzde + " Sini Yatırımlarınıza Ayırdınız.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
