import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 89, 4, 5, 62, 5, 7, 6, 10, 6, 4, 1, 9, 5, 4, 10, 62,1};
        int[] duplicate = new int[arr.length];
        int startIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }

        for (int i : duplicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }

    }
}