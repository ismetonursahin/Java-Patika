import java.util.*;
import java.io.*;

class Main {

    public static String TimeConvert(int num) {
        int saat;
        int dakika;
        // code goes here
        if(num > 59){
            saat = (int) Math.round(num/60);
            dakika = (int) Math.round(num % 60);
        }else{
            saat = 0;
            dakika = num;
        }
        String total  = saat + ":" + dakika ;
        return total;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TimeConvert(s.nextInt()));
    }

}