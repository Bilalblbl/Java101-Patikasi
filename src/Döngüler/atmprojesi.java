package Döngüler;

import java.util.Scanner;

public class atmprojesi {
    static String kuser = null;
    static String kpass = null;
    static int totalcash = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user, pass, newuser, newpass;
        int a = 3, oprt, b = 5;
        boolean isExit = false;

        do {

            System.out.print("1- Giriş Yap; \n2- Kayıt Ol;\n");
            System.out.print("Yapılacak işlemi seçiniz : ");
            oprt = input.nextInt();


            switch (oprt) {
                case 1:
                    System.out.println("\nGiriş İşlemi seçildi.İşlemden çıkış yapmak için Ad veya Parola kısmında 3 rakamını kullanın.\n");

                    while (a > 0) {

                        System.out.print("Kullanıcı Adını Giriniz : ");
                        user = input.nextLine();

                        input.nextLine();

                        System.out.print("Kullanıcı Parola Giriniz : ");
                        pass = input.nextLine();


                        if (user.equals("3") || pass.equals("3")) {
                            System.out.println("İşlem Sonlandırıldı \n");
                            isExit = true;
                            break;
                        } else if (user.equals(kuser) && pass.equals(kpass)) {
                            System.out.println("\nGiriş Başarılı\n");
                            islemYap();
                            break;
                        } else {
                            a--;
                            System.out.println("\nHatalı Kullanıcı Adı ve Parola \n");
                        }
                    }

                    if (a == 0) {
                        System.out.println("Giriş hakkınız doldu. Lütfen Banka ile İletişime geçin.");
                    }

                    break;

                case 2:
                    System.out.println("\nKayıt Ol işlemi seçildi\n");

                    System.out.print("Yeni Kullanıcı adı giriniz : ");
                    newuser = input.nextLine();

                    input.nextLine();

                    System.out.print("Yeni kullanıcı şifresi giriniz : ");
                    newpass = input.nextLine();

                    kuser = newuser;
                    kpass = newpass;
                    totalcash = 0;
                    System.out.println("\nKaydınız alındı. Giriş Yapabilirsiniz\n");

                    break;

                default:
                    System.out.println("\nHatalı Seçim Yaptınız. 1 ve 2 Rakamları arasında tercih yapınız. \n");
                    break;
            }


        } while (a > 0 && !isExit);
    }

    public static void islemYap() {
        Scanner input = new Scanner(System.in);
        int secim, cash1, cash2, cash3, money = 0;
        do {


            // Örnek olarak, işlemleri burada yapabilirsiniz
            System.out.println("1- Para çekme");
            System.out.println("2- Para yatırma");
            System.out.println("3- Bakiye sorgulama");
            System.out.println("4- Çıkış");


            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    // Para çekme işlemi
                    do {
                        System.out.println("Hesap Bakiyesi : " + totalcash);
                        System.out.print("\nÇekilecek tutar Tutar ; ");
                        money = input.nextInt();
                        if (money <= 0) {
                            System.out.println("\n0 ve 0'dan küçük tutar girilemez\n");
                        } else if (totalcash >= money) {
                            totalcash -= money;
                            System.out.println("\nYeni hesap bakiyesi : " + totalcash + "\n");
                        } else {
                            System.out.println("\nYetersiz bakiye! İşlem gerçekleştirilemedi.\n");
                        }
                    } while (money < 0);
                    break;
                case 2:
                    // Para yatırma işlemi
                    do {
                        System.out.print("Yatırılıcak Tutar ; ");
                        money = input.nextInt();
                        if (money < 0) {
                            System.out.println("\n0 ve 0'dan küçük tutar girilemez\n");
                        } else {
                            totalcash += money;
                            System.out.println("\nYeni hesap bakiyesi : " + (totalcash) + "\n");
                        }
                    } while (money < 0);
                    break;
                case 3:
                    // Bakiye sorgulama işlemi
                    System.out.println("\nToplam Hesap Bakiyesi : " + totalcash + "\n");
                    break;
                case 4:
                    System.out.println("\nİşlem sonlandırıldı.\n");
                    break;
                default:
                    System.out.println("\nGeçersiz seçim.\n");
                    break;
            }
        } while (secim != 4);
    }
}
