import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {

        String[][] harf = new String[5][5];

        for (int i = 0; i < harf.length; i++) {
            for (int j = 0; j < harf[i].length; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    harf[i][j] = (" * ");
                } else if (j == 0 || j == 4) {
                    harf[i][j] = (" * ");
                } else {
                    harf[i][j] = "   ";
                }
            }
        }

        for (int i = 0; i < harf.length; i++) {
            for (int j = 0; j < harf[i].length; j++) {
                System.out.print(harf[i][j]);
            }
            System.out.println();
        }

    }
}
