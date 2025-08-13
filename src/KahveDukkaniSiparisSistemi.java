import java.util.Scanner;

public class KahveDukkaniSiparisSistemi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kahvesayisi = 0;
        double tutar = 0;
        double toplamtutar = 0;
        final int limit = 5;

        outer: // dış döngü etiketi
        while (true) 
        {
            System.out.println("--MENÜ--" +
                    "\n1- Ice Latte" +
                    "\n2- Ice White Mocha" +
                    "\n3- Expresso" +
                    "\n4- White Chocolate Mocha" +
                    "\n5- Caramel Macchato" +
                    "\n6- Americano" +
                    "\n7- Caffe Latte" +
                    "\n8- Matcha Latte");

            System.out.print("Lütfen Menüden Seçim Yapınız: ");
            int kahvesecim = input.nextInt();

            
            if (kahvesecim < 1 || kahvesecim > 8) {
                System.out.println("Geçersiz Bir Kahve Seçimi Yaptınız.");
                continue;
            }

            
            switch (kahvesecim) {
                case 1: tutar = 215; break;
                case 2: tutar = 220; break;
                case 3: tutar = 180; break;
                case 4: tutar = 220; break;
                case 5: tutar = 230; break;
                case 6: tutar = 180; break;
                case 7: tutar = 200; break;
                case 8: tutar = 235; break;
            }

            
            kahvesayisi++;
            System.out.println("Eklendi. Şu ana kadar " + kahvesayisi + " adet kahve seçtiniz");

            toplamtutar += tutar;
            System.out.println("Seçtiğiniz kahvenin fiyatı: " + tutar);
            System.out.println("Toplam tutar: " + toplamtutar);

            
            if (kahvesayisi >= limit) 
            {
              
                double odenecek = (toplamtutar >= 500) ? toplamtutar * 0.90 : toplamtutar;
                
                if (toplamtutar >= 500)
                {
                    System.out.println("%10 indirim uygulandı.");
                }
                
                System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler :)");
                System.out.println("Ödemeniz Gereken Toplam Tutar: " + odenecek);
                break; 
            }

       
            while (true) 
            {
                System.out.print("Daha fazla seçim için 1, bitirmek için 0: ");
                int karar = input.nextInt();

                if (karar == 1) 
                {
                    break; 
                }
                
                else if (karar == 0) 
                {
                    double odenecek = (toplamtutar >= 500) ? toplamtutar * 0.90 : toplamtutar;
                    if (toplamtutar >= 500)
                    {
                        System.out.println("%10 indirim uygulandı.");
                    }
                    System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler :)");
                    System.out.println("Ödemeniz Gereken Toplam Tutar: " + odenecek);
                    break outer; // hem iç hem dış döngüyü bitir
                } 
                else 
                {
                    System.out.println("Lütfen sadece 0 veya 1 giriniz.");
                }
            } 
        }

  
    }
}



























