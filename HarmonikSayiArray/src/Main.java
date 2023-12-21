import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] arr = {34, 55, 67, 44, 200, 55, 84};

        double harmonik = 0;
        for (int i = 0; i < arr.length; i++) {
            harmonik += 1 / arr[i];
        }
        double average = arr.length / harmonik;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(average));
    }
}
