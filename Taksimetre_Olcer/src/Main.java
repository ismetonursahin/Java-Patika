import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

           double metre_fiyati ,mesafe,total;

        System.out.print("Ne kadar yol gidilecek : ");
        mesafe = scan.nextDouble();

        metre_fiyati= 2.20;

        total = mesafe * metre_fiyati;

        total =  total < 20 ? 20  : total;
        System.out.println(total + " Tl");
    }

}
