import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Tutar Belirleyiniz : ");
        double tutar = scan.nextDouble();
        double kdv = tutar * 0.20 ;
        double total = kdv+tutar;


        System.out.println("Kdv Tutarı : " + kdv);
        System.out.println("Toplam Fiyat : " +total);

    }
}