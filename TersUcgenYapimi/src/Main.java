import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        for (int i = number; i >= 1; i--) {
             for(int k = 1 ; k <= number-i ; k++){
                 System.out.print(" ");
             }
             for (int yildiz = 1 ; yildiz <= (2*i)-1; yildiz++){
                 System.out.print("*");
             }
            System.out.println();
        }
    }}

