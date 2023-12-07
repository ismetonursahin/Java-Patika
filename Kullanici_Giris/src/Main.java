import java.sql.SQLOutput;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        String name = input.next();

        System.out.print("Şifrenizi Giriniz : ");
        String password = input.next();


        if (name.equals("ismetonur") && password.equals("1234")) {
            System.out.println("Hoşgeldin " + name);
        } else if (!name.equals("ismetonur") && password.equals("1234")) {
            System.out.println("Kullanıcı Adı veya Şifre Hatalı");
        }else if (name.equals("ismetonur") && !password.equals("1234")){
            System.out.println("Şifre Yanlış Güncellemek İstermisin  ?");
            System.out.print("YES:y or NO:n ");
            String yes = input.next();
            if(yes.equals("y")){
                System.out.println("Yeni Şifreni Yaz : ");
                String newPassword = input.next();
                if(newPassword.equals("1234")){
                    System.out.println("Yeni Şifren Eskisiyle Aynı Olamaz.");
                    System.out.print("Yeni Şifre Giriniz :");
                    String newPassword1 = input.next() ;
                    if(!newPassword1.equals("1234") ){
                        System.out.println("Şifren Başarıyla Kaydedildi");
                    }else{
                        System.out.println("Çıkış Yapıldı XXXXX");
                    }
                }else{
                    System.out.println("Yeni Şifren Başarıyla Kaydedildi");
                }
            }else {
                System.out.println("Yeniden Giriş Yap");
            }
        }

    }
}