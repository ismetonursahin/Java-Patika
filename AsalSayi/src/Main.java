import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        boolean isPrime = true;
        for(int i = 2 ; i <= 100 ; i++){

            for (int a = 1 ; a <= i ; a++ ){
                if(i % a == 0){
                    isPrime= false;

            }
            }if(isPrime){
                System.out.println(i);
            }
        }
    }
}
