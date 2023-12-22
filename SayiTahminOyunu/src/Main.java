import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 50);
        System.out.println("-- SAYIYI TAHMİN ET -- \n " +
                "Oyuna 5 hak ile başlıyorsun.{ 1-50 }");
        System.out.println(number);

        int[] gecmis = new int[5];
        int count = 0;
        int selected;
        boolean isWrong = false;
        boolean isWin = false;

        while (count < 5) {
            System.out.print("Bir Sayı Gir : ");
            selected = input.nextInt();
            if (selected < 1 || selected > 49) {
                System.out.println(" 0-50 arasında bir sayı gir.");
                if (isWrong) {
                    count++;
                    System.out.println("**Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - count));
                } else {
                    isWrong = true;
                    System.out.println("**Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number) {
                gecmis[count] = selected;
                isWin = true;
                System.out.println("Tebrikler , Doğru Tahmin.");
                break;
            } else {

                gecmis[count] = selected;
                count++;
                if (count < 5) {
                    if (selected < number) {
                        System.out.println("Çık ↑ ");
                    } else {
                        System.out.println("İn ↓ ");
                    }
                    System.out.println((5 - count) + " Hakkın Kaldı :)");
                }
            }
        }

        if (!isWin && count==5) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                for (int i = 0 ; i<gecmis.length; i++){
                    if(gecmis[i]!=0){

                    }
                }

            }
        }
        System.out.println("Tahminleriniz : " + Arrays.toString(gecmis));
        System.out.println("Sayı : " + number);


    }
}