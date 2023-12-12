import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil ;

        System.out.print("Yıl giriniz : ");
        yil = input.nextInt();

         if(yil > 0) {  // Yıl negatif (-) bir değer olamaz.
            if(yil % 100 == 0){
                if(yil % 400 == 0){
                    System.out.println("artık yıldır.");
                } else  {
                    System.out.println("artık yıl değildir");
                }
             }else if (yil % 4 == 0) {
                System.out.println("artık yıldır");
            }else {
                System.out.println("artık yıl değil");
            }
         }else{ // Negatif değer sonucu.
            System.out.println("Yıl Değeri Negatif Olamaz !");
        }
    }
}

