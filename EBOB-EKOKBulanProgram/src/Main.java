import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 saysını giriniz : ");
        n2 = input.nextInt();

        int ebob=1;
        int ekok=1;

        if(n2>n1){
            for(int i = 1 ; i <= n1 ; i++){
                if(n1 % i == 0 && n2 % i == 0){
                   ebob = i ;
                   ekok=(n1*n2)/ebob;
                }
            }
            System.out.println("EBOB : " + ebob);
            System.out.println("EKOK : " + ekok);
        }if(n1>n2) {
            for(int i = 1 ; i <= n2;i++){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob=i;
                    ekok=(n1*n2)/ebob;
                }
            }
            System.out.println("EBOB : " + ebob);
            System.out.println("EKOK : " + ekok);
        }
    }
}
