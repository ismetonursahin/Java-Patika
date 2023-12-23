import java.util.Scanner;

public class Main {
  /*  static boolean isPalindrome(String word){
        int i =  0;
        int j = word.length()-1;
        while (i<j){
            if(word.charAt(i)==word.charAt(j)){
                 return true;
            }
            i++;
            j--;
        }
        return false;
    }
    */
    static boolean isPalindrome(String word){
        String reverseWord = "";
        for (int i = word.length()-1; i>=0;i--){
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Kelime Giriniz : ");
        String word = input.next();
        System.out.println("Kelime : " + word);


            if(isPalindrome(word)){
                System.out.println("Palindrom Kelimedir.");
            }else {
                System.out.println("Palindrom Kelime Değildir.");
            }





    }
}