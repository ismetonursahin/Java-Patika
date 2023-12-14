import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static boolean isPolidrom(int num) {
        int temp = num;
        int reverseNum = 0;
        int lastNum;

        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;

        }

        if (num == reverseNum) {
            System.out.println(reverseNum + " Sayısı Polindrom.");
            return true;
        } else {
            System.out.println(num + " Sayısı Polindrom sayı değil.");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int num;
        num = input.nextInt();
        isPolidrom(num);

    }
}