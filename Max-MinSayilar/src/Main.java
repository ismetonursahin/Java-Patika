import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;
        int max = 0;
        int min = 0 ;
        System.out.print("Kaç Sayı Gireceksiniz : ");
        x = input.nextInt();

       for(int i = 1 ; i <= x ; i++){
           System.out.print(i + ". Sayıyı giriniz : ");
           int num = input.nextInt();
           if(num<min || min == 0){
               min = num;
           }
           if(max<num){
               max=num;
           }

       }
        System.out.println("MAX : " + max);
        System.out.println("MİN : " +min);
    }
}