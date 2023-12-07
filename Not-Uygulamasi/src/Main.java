import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner input  =  new Scanner(System.in) ;


        System.out.print("Matematik 1. Vize Notunuzu Giriniz : ");
        double vizeNot1 = input.nextDouble();

        System.out.print("Matematik 2. Vize Notunuzu Giriniz : ");
        double vizeNot2 = input.nextDouble();

        System.out.print("Matematik Final Notunuzu Giriniz : ");
        double finalNot = input.nextDouble();


        double vizeHesaplama = 40 / 100f;
        double vizeTotal = ( vizeNot2 + vizeNot1 ) * vizeHesaplama;


        float finalHesaplama = 60/100f;
        double finalTotal  = finalNot * finalHesaplama;

        double total = finalTotal + vizeTotal ;

        if(finalNot>69.9 && total <50){
            System.out.println("Ortalaman : "+ total + " Final sınavından 70'in üzerinde aldığınız için geçtiniz.");
        }
        else if (total > 50 && finalNot>49.9) {
            System.out.println("Ortalaman : " + total +" Tebrikler Geçtiniz");
        }
        else if(total >50 && finalNot < 49.9){
            System.out.println("Ortalaman :  " + total + "  Final Notun 50'nin altında olduğu için dersi geçemedin!");
        }else {
            System.out.println("Dersi Geçemediniz.");
        }

    }

}
