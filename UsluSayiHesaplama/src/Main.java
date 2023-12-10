import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n , k;

        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();
        System.out.print("Üs Sayısını Giriniz : ");
        k = input.nextInt();

        int total = 1;

        for (int i = 1 ; i <= k ; i++){
            total *= n;
        }
        System.out.println( n + " ^ " + k + " = " +total);
    }
}