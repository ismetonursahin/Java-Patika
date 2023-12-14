import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int kacBasamakli = 0;
        int basamakDegeri;
        int basUsDegeri = 1;
        int armstrongTotal = 0;

        System.out.print("Bir sayı Gir : ");
        number = input.nextInt();
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            kacBasamakli++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basamakDegeri = tempNumber % 10;

            for (int i = 1; i <= kacBasamakli; i++) {
                basUsDegeri *= basamakDegeri;
            }

            armstrongTotal += basUsDegeri;
            tempNumber /= 10;
            basUsDegeri = 1; //  döngü her çalıştığında 1'den başlaması gerektiği için.
        }

        if (armstrongTotal == number) {
            System.out.println(number + " bir Armstrong sayıdır.");
            System.out.println("Basamak değerlerinin üsleri toplamı : " + number);

        } else {
            System.out.println(number + " bir Armstrong sayı değildir. ");
            System.out.println("Basamak değerlerinin üsleri toplamı : " + armstrongTotal);
        }
    }
}


