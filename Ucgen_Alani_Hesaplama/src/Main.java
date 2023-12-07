import java.awt.*;
import java.util.Scanner;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        double cevre, alan, s;

        // Kullanıcı'dan üçgenin kenar değerlerini burada alıyoruz.
        System.out.print("1. Kenarın Uzunluğunu Giriniz : ");
        a = scan.nextInt();

        System.out.print("2. Kenarın Uzunluğunu Giriniz : ");
        b = scan.nextInt();

        System.out.print("3. Kenarın Uzunluğunu Giriniz : ");
        c = scan.nextInt();

        // Çevre alan hesapladığımız formüller.
        cevre = (a + b + c);
        s = cevre / 2;
        alan = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));

        if (isNaN(alan) == true) {
            System.out.println("Bir Kenar Diğerlerinden Çok Daha Uzun");
        } else {
            System.out.println("Üçgenin Çevresi : " + cevre + " birim");
            System.out.println("Üçgenin Alanı : " + alan + " birim");

        }
    }
}