package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double heat ;

        System.out.print("Hava sıcaklık derecesini giriniz : ");
        heat = input.nextDouble();

        if (heat > 25){
            System.out.println(heat + " Derece için önerdiğimiz etkinlik : " + "Yüzmeye gidebilirsiniz.");
        }else if (heat == 15){
            System.out.println(heat + " Derece için önerdiğimiz etkinlik : " + "Piknik yapmaya veya Sinema izlemeye gidebilirsiniz.");
        } else if (heat >= 15 && heat <= 25) {
            System.out.println(heat + " Derece için önerdiğimiz etkinlik : " + "Piknik yapmaya gidebilirsiniz.");
        } else if (heat >= 5 && heat <15) {
            System.out.println(heat + " Derece için önerdiğimiz etkinlik : " + "Sinema izlemeye gidebilirsiniz.");
        }else {
            System.out.println(heat + " Derece için önerdiğimiz etkinlik : " + "Kayak yapmaya gidebilirsiniz.");
        }
    }
}
