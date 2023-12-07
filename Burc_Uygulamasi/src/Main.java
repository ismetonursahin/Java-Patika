import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun ;
        String ay ;

        System.out.println("Burç Öğrenme Uygulaması");

        System.out.print("Doğum Gününüzü Sadece Gün Olarak Yazın : ");
          gun = input.nextInt();
        System.out.print("Doğum Ayınızı Yazıyla Yazın : ");
          ay = input.next();


          System.out.println(gun+ " "+ay);

          switch (ay){
              case "Ocak" :
                  if(gun > 20){
                      System.out.println("Kova");
                  }else {
                      System.out.println("Oğlak");
                  }
                  break;
              case "Şubat" :
                  if(gun > 19){
                      System.out.println("Balık");
                  }else{
                      System.out.println("Kova");
                  }
                  break;
              case "Mart" :
                  if(gun > 20){
                      System.out.println("Koç");
                  }else{
                      System.out.println("Balık");
                  }
                  break;
              case "Nisan" :
                  if(gun > 20){
                      System.out.println("Boğa");
                  }else{
                      System.out.println("Koç");
                  }
                  break;
              case "Mayıs" :
                  if(gun > 20){
                      System.out.println("İkizler");
                  }else{
                      System.out.println("Boğa");
                  }
                  break;
              case "Haziran" :
                  if(gun > 21){
                      System.out.println("Yengeç");
                  }else{
                      System.out.println("İkizler");
                  }
                  break;
              case "Temmuz" :
                  if(gun > 22){
                      System.out.println("Aslan");
                  }else{
                      System.out.println("Yengeç");
                  }
                  break;
              case "Ağustos" :
                  if(gun > 23){
                      System.out.println("Başak");
                  }else{
                      System.out.println("Aslan");
                  }
                  break;
              case "Eylül" :
                  if(gun > 23){
                      System.out.println("Terazi");
                  }else{
                      System.out.println("Başak");
                  }
                  break;
              case "Ekim" :
                  if(gun > 23){
                      System.out.println("Akrep");
                  }else{
                      System.out.println("Terazi");
                  }
                  break;
              case "Kasım" :
                  if(gun > 22){
                      System.out.println("Yay");
                  }else{
                      System.out.println("Akrep");
                  }
                  break;
              case "Aralık" :
                  if(gun > 21){
                      System.out.println("Oğlak");
                  }else{
                      System.out.println("Yay");
                  }
                  break;

          }
    }
}