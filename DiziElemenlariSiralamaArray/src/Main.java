import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array Kaç Elemanlı : ");

        int number = input.nextInt();
        int value;
        int[] yeniArray = new int[number];
        int ekle = 0;

        for (int i = 0; i < number; i++) {
            System.out.print((i + 1) + ". sayı : ");
            value = input.nextInt();
            yeniArray[ekle++] = value;
        }

        Arrays.sort(yeniArray);
        System.out.println("Sıralama : " + Arrays.toString(yeniArray));


    }
}