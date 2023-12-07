import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uçak Bileti Uyulaması");

        double  tipIndirimi,cocukIndirimi,yasliIndirimi,tutar,mesafe,mesafeUcreti = 0.10;
        int yolculukTipi,yas;

        System.out.print("Gidilecek Mesafe : ");
        mesafe = input.nextDouble();

        System.out.print("Yolculuk Tipi Seçiniz '1-TEK YÖN , 2-GİDİŞ-DÖNÜŞ' : ");
        yolculukTipi = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        if (mesafe > 0 && yas > 0) {
            //Mesafe ve yaş değerleri pozitif olduğu durumda çalışacak kod.
            if (yolculukTipi == 1) {
                if ((yas > 24 && yas < 65)) {
                    // Tek yön seçilmesi durumunda "yetişkin" bireylerin bilet fiyatlandırması
                    tutar = mesafe * mesafeUcreti;
                    System.out.println(tutar);
                } else if (yas > 65) {
                    //Tek yön seçilmesi durumunda "yaşlı" bireylerin bilet fiyatlandırması
                    yasliIndirimi = mesafeUcreti - (mesafeUcreti * 0.30);
                    tutar = mesafe * yasliIndirimi;
                    System.out.println(tutar);
                } else if (yas < 12) {
                    //Tek yön seçilmesi durumunda "çocukların" bilet fiyatlandırması
                    cocukIndirimi = mesafeUcreti - (mesafeUcreti * 0.50);
                    tutar = mesafe * cocukIndirimi;
                    System.out.println(tutar);
                }

            } else if (yolculukTipi == 2) {
                if ((yas > 24 && yas < 65)) {
                    //Gidiş-Dönüş seçilmesi durumunda "yetişkin" bireylerin bilet fiyatlandırması
                    tipIndirimi = mesafeUcreti - (mesafeUcreti * 0.2);
                    tutar = mesafe * tipIndirimi * 2;
                    System.out.println(tutar);
                } else if (yas > 65) {
                    //Gidiş-Dönüş seçilmesi durumunda "yaşlı" bireylerin bilet fiyatlandırması
                    tipIndirimi = mesafeUcreti - (mesafeUcreti * 0.2);
                    yasliIndirimi = tipIndirimi - (tipIndirimi * 0.30);
                    tutar = yasliIndirimi * mesafe * 2;
                    System.out.println(tutar);
                } else if (yas < 12) {
                    //Gidiş-Dönüş seçilmesi durumunda "çocukların" bilet fiyatlandırması
                    tipIndirimi = mesafeUcreti - (mesafeUcreti * 0.2);
                    cocukIndirimi = tipIndirimi - (tipIndirimi * 0.50);
                    tutar = cocukIndirimi * mesafe * 2;
                    System.out.println(tutar);
                }

            } else if (yolculukTipi < 0 || yolculukTipi > 2) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
