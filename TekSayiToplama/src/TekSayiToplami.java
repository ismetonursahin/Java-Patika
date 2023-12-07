import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int x ;
        int toplam = 0;


        do{
            System.out.print("Bir Sayı Gir : ");
            x = input.nextInt();
            if(x % 4 == 0 ) {
                toplam += x;

            }
        }while(x % 2 == 0 && x > 0);

        System.out.println(toplam);
    }
}
