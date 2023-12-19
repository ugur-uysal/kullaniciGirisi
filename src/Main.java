import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, select, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        userName = inp.nextLine();

        System.out.print("Şifre : ");
        password = inp.nextLine();

        if(userName.equals("Patika") && password.equals("Java123")){
            System.out.println("Giriş Başarılı !");
        } else{
            System.out.println("Yanlış Şifre Girdiniz !");
            System.out.print("Şifrenizi değiştirmek ister misiniz ? (y/n) : ");
            select = inp.nextLine();

            if(select.equals("y")){
                System.out.print("Yeni Şifre : ");
                newPassword = inp.nextLine();

                if(newPassword.equals(password) || newPassword.equals("Java123"))
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                else
                    System.out.println("Şifre oluşturuldu.");

            }
        }
    }
}