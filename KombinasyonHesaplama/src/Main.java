import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplama Programı ");

        int n,r;
        int nTotal = 1, rTotal= 1 , xTotal=1;

        System.out.print("İlk Değeri Giriniz : ");
          n = input.nextInt();
        System.out.print("İkinci Değeri Giriniz : ");
          r = input.nextInt();

        int x = n - r;
        int combination ;

        for(int i = 1 ; i <= n ; i++){
            nTotal *= i;
        }
        for(int i = 1 ; i <= r ; i++){
            rTotal *= i;
        }
        for(int i = 1 ; i <= x ; i++){
            xTotal *= i;
        }
        combination = nTotal / (rTotal * (xTotal));
        System.out.println("C("+n+","+r+")"+ " = " + combination);

    }
}