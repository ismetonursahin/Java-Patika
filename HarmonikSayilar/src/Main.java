import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double n ;
        double nTotal = 0;

        System.out.print("Bir n Sayısı Giriniz : ");
        n = input.nextInt();

        for(double i = 1 ; i <= n ; i++){
            nTotal += 1 / i;

        }

        System.out.println(nTotal);

    }
}