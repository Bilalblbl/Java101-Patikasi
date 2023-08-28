package Metotlar;

import java.util.Scanner;
public class calculatorMachine {
    static void plus(){
            Scanner tnum = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz : ");
        int ttotal = tnum.nextInt();
        int number, result = 0;

        for (int i = 1 ; i <= ttotal; i++){
            System.out.print(i + ". Sayı : ");
            number =tnum.nextInt();
            result+=number;
        }
        System.out.println("Sonuç : " + result + "\n");
    }

    static void minus(){
            Scanner tnum = new Scanner(System.in);
            System.out.println("Kaç Sayı Gireceksiniz : ");
            int ttotal = tnum.nextInt();
            int number, result = 0;

            for (int i = 1 ; i <= ttotal; i++){
                System.out.print(i + ". Sayı : ");
                number =tnum.nextInt();
                if (i == 1) {
                    result += number;
                    continue;
                }
                result -= number;
            }
            System.out.println("Sonuç : " + result + "\n");
    }

    static void times(){
        Scanner tnum = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz : ");
        int ttotal = tnum.nextInt();
        int number, result = 0;

        for (int i = 1 ; i <= ttotal; i++){
            System.out.print(i + ". Sayı : ");
            number =tnum.nextInt();
            if (i == 1) {
                break;
            }

            if (number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result + "\n");
    }

    static void divided(){
        Scanner tnum = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz : ");
        int ttotal = tnum.nextInt();
        double number,result = 0;

        for (int i = 1 ; i <= ttotal; i++){
            System.out.print(i + ". Sayı : ");
            number =tnum.nextDouble();

            if (number == 0) {
                System.out.println("Böleni 0 giremezsiniz." + "\n");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result + "\n");
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result + "\n");
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("A Sayısını giriniz :");
        int a = scan.nextInt();
        System.out.print("B Sayısını giriniz :");
        int b = scan.nextInt();

        int result;

      result = a % b;

        System.out.println("Sonuç : " + result + "\n");
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa Kenarı giriniz :");
        int a = scan.nextInt();
        System.out.print("Uzun Kenarı giriniz :");
        int b = scan.nextInt();

        int aresult,çresult;

        aresult = a * b;
        çresult = 2 * (a + b);

        System.out.println("Alan Sonuç : " + aresult + "\n" + "Çevre Sonuç : " + çresult + "\n"  );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,islem,total,select;
        String menu1 = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Daha fazla İşlem\n"

                + "0- Çıkış Yap";

        String menu2 = "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            menu1 = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme İşlemi\n"
                    + "5- Daha fazla İşlem\n"
                    + "0- Çıkış Yap";

            System.out.println(menu1);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    menu2 = "6- Faktoriyel Hesaplama\n"
                            + "7- Mod Alma\n"
                            + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                            + "0- Çıkış Yap";

                    System.out.println(menu2);
                    int subSelect = input.nextInt();

                    switch (subSelect) {
                        case 6:
                            factorial();
                            break;
                        case 7:
                            mod();
                            break;
                        case 8:
                            rectangle();
                            break;

                        default:
                            System.out.println("Geçersiz İşlem");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }
        } while (select != 0);
    }
}