import java.util.Scanner;

public class SayiOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        int total = 0 ;
        int kacKereCalisti = 0;
        System.out.print("Bir Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (i % 4 == 0 && i % 3 == 0) {
                total += i;
                kacKereCalisti++;
            }
        }
        System.out.println(total / kacKereCalisti);
    }
}
