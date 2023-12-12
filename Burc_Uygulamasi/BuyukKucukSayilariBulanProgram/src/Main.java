import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int kacSayi ;
        int max = 0;
        int min = 0;

        System.out.print("Kac Tane Sayı Gireceksiniz : ");
        kacSayi = input.nextInt();

        for (int i = 1 ; i <= kacSayi ; i++){
            System.out.print(i +". Sayıyı Giriniz : " );
            number = input.nextInt();

            if(number > max){
                max = number;
            }
            if(number < min || min < 0){
                min = number;
            }

        }
        System.out.println("En Büyük Sayı " + max);
        System.out.println("En Küçük Sayı " + min);
    }
}