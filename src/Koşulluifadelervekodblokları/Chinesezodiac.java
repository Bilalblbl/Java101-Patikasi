package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Chinesezodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birth,result ;

        System.out.println("Çin Zodyağı Hesaplama Programına Hoşgeldiniz!\n");
        System.out.print("Doğum Yılınızı giriniz : ");
        birth = input.nextInt();
        System.out.println();
        result = birth % 12;

        if (result == 0){
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Maymun");
        } else if (result == 1) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Horoz");
        } else if (result == 2) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Köpek");
        } else if (result == 3) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Domuz");
        } else if (result == 4) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Fare");
        } else if (result == 5) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Öküz");
        } else if (result == 6) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Kaplan");
        } else if (result == 7) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Tavşan");
        } else if (result == 8) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Ejderha");
        } else if (result == 9) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Yılan");
        } else if (result == 10) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz At");
        } else if (result == 11) {
            System.out.println(birth + " Yılı için kalan " + result + " Çin Zodyağı sonucunuz Koyun");
        } else {
            System.out.println("Geçersiz Çıktı");
        }
    }
}
