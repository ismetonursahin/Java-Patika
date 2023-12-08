import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number ;
        int sonuc = 1;

        System.out.print("Bir Sayı Giriniz : ");
         number = input.nextInt();

         for(int i = 1 ; i <= number ; i++){
             sonuc *= i;
         }
             System.out.println(number + "!" + " = " + sonuc);

    }
}