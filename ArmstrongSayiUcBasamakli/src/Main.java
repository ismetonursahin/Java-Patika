import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 100 ; i < 1000 ; i++ ){
            int tempNumber = i;
            int howDigits= 0;
            int valueExponent =1;
            int digitsValue;
            int armstrongNum = 0;

            while (tempNumber != 0 ){
                tempNumber /= 10 ;
                howDigits++;
            }

            tempNumber = i;
            while(tempNumber != 0){
               digitsValue = tempNumber % 10;
                for(int x = 1 ; x <= howDigits ; x++){
                    valueExponent *= digitsValue ;
                }
                armstrongNum += valueExponent ;
                tempNumber /= 10;
                valueExponent = 1;
            }
            if(armstrongNum == i){
                System.out.println(i);
            }
        }






    }
}