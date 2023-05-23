package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,select,result;

        System.out.print("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.print("B sayısını giriniz : ");
        b = input.nextInt();


        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapılacak işlemi seçin");
        select = input.nextInt();

        switch (select){
            case 1 :
                result = a + b ;
                System.out.println("Toplama İşleminin Sonucu " + result);
                break;

            case 2 :
                result = a - b ;
                System.out.println("Çıkarma İşleminin Sonucu " + result);
                break;

            case 3 :
                result = a * b ;
                System.out.println("Çarpma İşleminin Sonucu " + result);
                break;

            case 4 :
                if (a != 0 && b != 0){
                    result = a / b ;
                    System.out.println("Bölme İşleminin Sonucu " + result);
                }
                else {
                    System.out.println("Bölme işleminde 0 kullanılamaz. Farlı bir sayı deneyiniz.");
                }
        }
    }
}
