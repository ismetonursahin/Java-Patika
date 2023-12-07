import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Meyve ve Sebzelerin Kilogram Fiyatları

        double armut     = 2.14;
        double elma      = 3.67;
        double domates   = 1.11;
        double muz       = 0.95;
        double patlican  = 5;

        //Kullanıcı'dan alacağımız kg değerleri.
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double total ;

        System.out.print("Kaç Kilo Armut Alacaksınız : ");
        armutKg = input.nextDouble();
        System.out.print("Kaç Kilo Elma Alacaksınız : ");
        elmaKg = input.nextDouble();
        System.out.print("Kaç Kilo Muz Alacaksınız : ");
        muzKg = input.nextDouble();
        System.out.print("Kaç Kilo Patlican Alacaksınız : ");
        patlicanKg = input.nextDouble();
        System.out.print("Kaç Kilo Domates Alacaksınız :");
        domatesKg = input.nextDouble();

        total = (armutKg*armut)+(domatesKg*domates)+(elma*elmaKg)+(muz*muzKg)+(patlicanKg*patlican);
        System.out.println("Toplam Tutar "+total+ " Tl") ;


    }
}