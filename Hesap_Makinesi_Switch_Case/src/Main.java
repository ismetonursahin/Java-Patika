import javax.script.ScriptEngine;
import java.awt.*;
import java.time.chrono.IsoChronology;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
          double sonuc;

        System.out.print("1. Sayıyı Giriniz : ");
          double ilk = input.nextDouble();

        System.out.print("2. Sayıyı Giriniz : ");
          double iki = input.nextDouble();

        System.out.println("Hangi işlemi Yaptırmak istersin ?");
        System.out.println("1- Toplama , 2-Çıkarma , 3-Çarpma , 4-Bölme ;");
        System.out.print("İşlem İçin Rakam Seç : ");

        int islem = input.nextInt();

           switch (islem){
               case 1 :
                   sonuc  = ilk + iki;
                   System.out.println(sonuc);
                   break;
               case 2 :
                   sonuc = ilk - iki;
                   System.out.println(sonuc);
                   break;
               case 3 :
                   sonuc = ilk * iki;
                   System.out.println(sonuc);
                   break;
               case 4 :
                   if(iki == 0 || ilk ==0){
                       System.out.println(" 0'a bölünemez");
                   }else {
                       sonuc = ilk / iki;
                       System.out.println(sonuc);
                   }
                   break;

           }
    }
}