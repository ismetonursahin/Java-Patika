import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uçak Bileti Uyulaması");

        int     pathType,
                age;

        double  price,
                distance;

        double  distancePrice    = 0.10,
                oldDiscounted    = distancePrice - (distancePrice * 0.30),
                childDiscounted  = distancePrice - (distancePrice * 0.50),
                youngDiscounted  = distancePrice - (distancePrice * 0.10),
                typeDiscount     = distancePrice - (distancePrice * 0.20);

        System.out.print("Gidilecek Mesafe : ");
        distance = input.nextDouble();

        System.out.print("Yolculuk Tipi Seçiniz '1-TEK YÖN , 2-GİDİŞ-DÖNÜŞ' : ");
        pathType = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();

        boolean isAdultAge = age >= 24 && age < 65;
        boolean isOldAge = age >= 65;
        boolean isChildAge = age <= 12;
        boolean isYoungAge = age > 12 && age < 24;

        if (distance > 0 && age > 0) {
            //Mesafe ve yaş değerleri pozitif olduğu durumda çalışacak kod.
            if (pathType == 1) {
                if (isAdultAge) {
                    // Tek yön seçilmesi durumunda "yetişkin" bilet fiyatlandırması
                    price = distance * distancePrice;
                    System.out.println(price);
                } else if (isOldAge) {
                    //Tek yön seçilmesi durumunda "yaşlı" bilet fiyatlandırması
                    price = distance * oldDiscounted;
                    System.out.println(price);
                } else if (isChildAge) {
                    //Tek yön seçilmesi durumunda "çocuk" bilet fiyatlandırması
                    price = distance * childDiscounted;
                    System.out.println(price);
                } else if (isYoungAge) {
                    //Tek yön seçilmesi durumunda "genç" bilet fiyatlandırması
                    price = distance * youngDiscounted;
                    System.out.println(price);
                }

            } else if (pathType == 2) {
                if (isAdultAge) {
                    //Gidiş-Dönüş seçilmesi durumunda "yetişkin" bilet fiyatlandırması
                    price = distance * typeDiscount * 2 * 10;
                    System.out.println(price);
                } else if (isOldAge) {
                    //Gidiş-Dönüş seçilmesi durumunda "yaşlı" bilet fiyatlandırması
                    price = oldDiscounted * distance * typeDiscount * 2 * 10 ;
                    System.out.println(price);
                } else if (isChildAge) {
                    //Gidiş-Dönüş seçilmesi durumunda "çocuk" bilet fiyatlandırması
                    price = childDiscounted * distance * typeDiscount * 2 * 10;
                    System.out.println(price);
                } else if (isYoungAge) {
                    //Gidiş-Dönüş seçilmesi durumunda "genç" bilet fiyatlandırması
                    price = distance * youngDiscounted * typeDiscount * 2 * 10;
                    System.out.println(price);
                }

            } else if (pathType < 0 || pathType > 2) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
