package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Horoscopeprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month ;

        System.out.print("Doğum Gününüz : ");
        day = input.nextInt();

        System.out.println("\n1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        System.out.print("Doğum ayınızı yazınız :");
        month = input.nextInt();
        System.out.println();

        if (day > 31 || month > 12) {
            System.out.println("\nHatalı giriş yaptınız Tekrar deneyiniz...");
        }else if (month == 1){
            if (day >= 1 && day <= 21){
                System.out.println("Oğlak Burcu");
            } else if (22 <= day && day <= 31){
                System.out.println("Kova Burcu");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19){
                System.out.println("Kova Burcu");
            } else if (day >= 20 && day <= 28) {
                System.out.println("Balık Burcu");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20){
                System.out.println("Balık Burcu");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Koç Burcu");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20){
                System.out.println("Koç Burcu");
            } else if (day >= 21 && day <= 30) {
                System.out.println("Boğa Burcu");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 21){
                System.out.println("Boğa Burcu");
            } else if (day >= 22 && day <= 31) {
                System.out.println("İkizler Burcu");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 22){
                System.out.println("İkizler Burcu");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Yengeç Burcu");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22){
                System.out.println("Yengeç Burcu");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Aslan Burcu");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22){
                System.out.println("Aslan Burcu");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Başak Burcu");
            }
        } else if (month == 9) {
            if ( day >= 1 && day <= 22){
                System.out.println("Başak Burcu");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Terazi Burcu");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22){
                System.out.println("Terazi Burcu");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Akrep Burcu");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 21){
                System.out.println("Akrep Burcu");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Yay Burcu");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21){
                System.out.println("Yay Burcu");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Oğlak Burcu");
            }
        }
    }
}
