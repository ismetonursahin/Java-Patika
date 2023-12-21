import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {5,89,-56,45,21,-5,-33,-2,26};

        int max = arr[0];
        int min = arr[0];
        for( int i : arr){
            if(i<min){
                min=i;
            }if(i>max){
                max = i;
            }
        }
        System.out.println("Max Number : " + max);
        System.out.println("Min Number : " + min);

        Arrays.sort(arr);
        System.out.println("Min En Yakın Değer : " + arr[1]);
        System.out.println("Min En Yakın Değer : " + arr[arr.length-2]);





    }
}