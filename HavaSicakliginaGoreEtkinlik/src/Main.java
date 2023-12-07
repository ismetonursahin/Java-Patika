import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double derece ;

        System.out.print("Hava bugün kaç derece : " );
        derece= input.nextDouble();
        if(derece<5){
            System.out.println("Kayak Yapabilirsiniz");

        }else if(derece>5 && derece<=10){
            System.out.println("Sinemaya Gidebilirsin");

        }else if(derece>10 && derece<=20){
            System.out.println("Piknik Yapabilirsin");
        }
        else if(derece>=15 && derece>25){
            System.out.println("Yüzmeye Gidebilirsin");

        }
    }
}
      
        