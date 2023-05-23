package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Userlogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName,password,newpassword;
        int prc;

        System.out.print("Kullanıcı Adı Giriniz :");
        userName = input.nextLine();

        System.out.print("Kullanıcı Şifre Giriniz :");
        password = input.nextLine();

        System.out.println("");

        if (userName.equals("patika") && password.equals("123")){
            System.out.println("Kullanıcı Girişi Başarılı");
        }else{
            System.out.println("Hatalı Kullanıcı Girişi Yaptınız. Yapılacak İşlemi Seçin.");
            System.out.print("\n1 - Şifremi unuttum. Şifremi Sıfırlamak İstiyorum.\n2 - Çıkış Yap\n\nHangi İşlem İle Devam Etmek İstiyorsunuz? :");
            prc = input.nextInt();
            input.nextLine();

            if (prc == 1){
            System.out.println("\nŞifre sıfırlamayı seçtiniz. Yeni Şifrenizi Oluşturunuz.");
            System.out.print("\nYeni Kullanıcı Şifre = ");
            newpassword = input.nextLine();
            if (newpassword.equals("123")){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }else{
                System.out.println("Şifreniz Oluşturuldu...");
            }
        } else if (prc == 2) {
                System.out.println("Çıkışınız Yapılıyor...");
            }else {
                System.out.println("1 ile 2 sayıları dışında seçim yapamazsınız.");
            }
        }
    }
}
