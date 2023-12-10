import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n ;

        System.out.print("Bir Sayı Giriniz : ");
        n = input.nextInt();

        for(int i = 1 ; i <= n ; i++){
          for(int k = 1 ; k <= (n-i); k++){
              System.out.print(" ");
          }
          for(int j = 1 ; j <= (2*i) -1 ; j++){
              System.out.print("*");
          }
            System.out.println();
        }

    }
}