import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili;

        System.out.print("Doğum yılınızı giriniz : ");
        dogumYili = input.nextInt();

        if(dogumYili > 0){
            if(dogumYili % 12 == 0){
                System.out.println("MAYMUN");
            } else if (dogumYili % 12 == 1) {
                System.out.println("HOROZ");
            }else if (dogumYili % 12 == 2) {
                System.out.println("KÖPEK");
            }else if (dogumYili % 12 == 3) {
                System.out.println("DOMUZ");
            }else if (dogumYili % 12 == 4) {
                System.out.println("FARE");
            }else if (dogumYili % 12 == 5) {
                System.out.println("ÖKÜZ");
            }else if (dogumYili % 12 == 6) {
                System.out.println("KAPLAN");
            }else if (dogumYili % 12 == 7) {
                System.out.println("TAVŞAN");
            }else if (dogumYili % 12 == 8) {
                System.out.println("EJDERHA");
            }else if (dogumYili % 12 == 9) {
                System.out.println("YILAN");
            }else if (dogumYili % 12 == 10) {
                System.out.println("AT");
            }else if (dogumYili % 12 == 11) {
                System.out.println("KOYUN");
            }

        }else{
            System.out.println("HATALI DOĞUM TARİHİ GİRDİNİZ .");
        }
    }
}