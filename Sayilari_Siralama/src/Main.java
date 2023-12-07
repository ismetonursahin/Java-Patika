import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,c;
        System.out.println("Sayıları Sıralama Programı");

        System.out.print("A. Sayıyı Seçiniz : ");
        a = scan.nextDouble();
        System.out.print("B. Sayıyı Seçiniz : ");
        b = scan.nextDouble();
        System.out.print("C. Sayıyı Seçiniz : ");
        c = scan.nextDouble();

        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("A < B < C");
            }else {
                System.out.println("A < C < B");
            }

        } else if ((a>b)&&(a>c)) {
            if(b>c){
                System.out.println("C < B < A");
            }else {
                System.out.println("B < C < A");
            }
        }else if((b>a)&&(b>c)){
            if(a>c){
                System.out.println("C < A < B");
            }
        }
    }
}