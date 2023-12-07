import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,index;

        System.out.println("VÜCUT KİTLE İNDEX HESAPLAMA");
        System.out.println("Boyunuzu ve kilonuzu yazarken virgül ile yazınız '#örn:1,75 ve 85,5'!");

        System.out.print("Lütfen Boyunuzu Yazınız : ");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Yazınız : ");
        kilo = input.nextDouble();

        index = kilo / (boy * boy);

        if(index<18.5){
            System.out.println(index + " kg/m2 " + " Zayıf");
        }else if(index >= 18.9 && index <= 24.9){
            System.out.println(index + " kg/m2 " + " Normal Ağırlıkta");
        }else if(index >= 25 && index <= 29.9){
            System.out.println(index + " kg/m2 " + " Kilolu ");
        }else if(index >= 30 && index <= 34.9){
            System.out.println(index + " kg/m2 " + " 1. Derece Obezite ");
        }else if(index >= 35 && index > 39.9){
            System.out.println(index + " kg/m2 " + " 2. Derece Obezite");
        }
    }
}

