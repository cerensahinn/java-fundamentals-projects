import java.util.Scanner;

public class BasitRestoranSiparisProgrami {

	public static void main(String[] args) {

		System.out.println("\n--MENÜ--");
		System.out.println("\n1-Hamburger : 250 TL" +
		"\n2-Hamburger Menü (patates + seçtiğiniz bir içecek) : 350 TL"+
		"\n3-Pizza : 220 TL "+
		"\n4-Pizza Menü (nugget + seçtiğiniz bir içecek) : 320 TL "+
		"\n5-Makarna : 180 TL " +
		"\n6-Salata 200 TL");
		
		
		System.out.println("\n --İçecekler--");
		System.out.println("\n7-Kola : 50 TL"+
		"\n8-Ice Tea : 50 TL" +
		"\n9-Ayran : 30 TL "+
		"\n10-Su : 10 TL");
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("\nlÜTFEN YEMEK SEÇİMİ YAPINIZ (1-6)  :");
		int yemeksecimi=inputScanner.nextInt();
		int toplamfiyat=0;
		
		switch(yemeksecimi) {
		case 1 : 
			toplamfiyat +=  250;
			System.out.println("Hamburger Seçtiniz. Fiyat: 250 TL");
		    break;
		case 2 :
			toplamfiyat +=350;
			System.out.println("Hamburger Menü Seçtiniz. Fiyat: 350 TL");
			break;
		case 3 : 
			toplamfiyat += 220;
			System.out.println("Pizza Seçtiniz. Fiyat: 220 TL");
			break;
		case 4 : 
			toplamfiyat +=320;
			System.out.println("Pizza Menü Seçtiniz. Fiyat: 320 TL");
			break;
		case 5 :
			toplamfiyat +=180;
			System.out.println("Makarna Seçtiniz. Fiyat: 180 TL");
			break;
		case 6 :
			toplamfiyat +=200;
			System.out.println("Salata Seçtiniz: Fiyat: 200 TL");
			break;
		default:
		    System.out.println("Geçersiz Seçim Yaptınız veya Yemek Seçmediniz. Menüyü Gözden Geçirebilirsiniz.");
		    
		break;
		
		}
		
	
		int iceceksecimi;
		System.out.print("\nLÜTFEN İÇECEK SEÇİMİ YAPINIZ (7-10) ");
		iceceksecimi=inputScanner.nextInt();
		
		switch(iceceksecimi) {
		case 7 : 
			toplamfiyat +=50;
			System.out.println("Kola Seçtiniz. Fiyat: 50 TL ");
			break;
		case 8 : 
			toplamfiyat +=50;
			System.out.println("Ice Tea Seçtiniz. Fiyat: 50 TL ");
			break;
		case 9 : 
			toplamfiyat +=30;
			System.out.println("Ayran Seçtiniz. Fiyat: 30 TL ");
			break;
		case 10 :
			toplamfiyat +=10;
			System.out.println("Su Seçtiniz. Fiyat: 10 TL ");
			break;
			default:
				System.out.println("Geçersiz Seçim Yaptınız veya İçecek Seçmediniz. Menüyü Gözden Geçirebilirsiniz.");
				break;
		}
		
		System.out.println("\n Toplam Ödeme Tutarınız: " +toplamfiyat + "TL");
		
		inputScanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
	}

}
