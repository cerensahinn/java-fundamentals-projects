import java.util.Scanner;

public class KdvHesaplayanProgram {

	public static void main(String[] args) {
    
		double tutar,kdvliFiyat, kdv=0.18 , kdvTutari;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Ürünün Tutarını Giriniz : ");
		
		tutar=input.nextDouble();
		
		kdvliFiyat= tutar +(tutar*kdv);
		kdvTutari= kdvliFiyat-tutar;
		
		System.out.println("Aldığınız ürünün tutarı : " + tutar +"TL" +
				" Ürünün hesaplanan KDV 'li tutarı ise : "  +kdvliFiyat + "TL" 
				+ " Ödediğiniz Toplam KDV tutarı : " + kdvTutari + "TL1259");
		
		
		
	}

}
