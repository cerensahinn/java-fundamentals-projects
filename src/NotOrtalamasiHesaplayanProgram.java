import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) {

		double vizenotu ;
		double finalnotu ;
	    double  quiznotu ;
		double ortalamanot ;
		String sonuc;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen Vize Notunuzu Giriniz: ");
		
		vizenotu = input.nextDouble();
		
		System.out.print("Lütfen Final Notunuzu Giriniz : ");
		
		finalnotu= input.nextDouble();
		
		System.out.print("Lütfen Quiz Notunuzu Giriniz: ");
		
		quiznotu=input.nextDouble();
		
		
		ortalamanot= (vizenotu * 0.4) + (finalnotu * 0.5) + (quiznotu * 0.1);
		
		
		sonuc= (ortalamanot <= 50 ) ? "Üzgünüm Kaldınız (Mazeret Sınavı İçin Bilgilendirme SMS Yoluyla Yapılacaktır). ":
			"Tebrikler Geçtiniz" ;
		
		System.out.println("Ortalama Notunuz : " + ortalamanot + 
				" Olarak Hesaplanmıştır." + sonuc );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
