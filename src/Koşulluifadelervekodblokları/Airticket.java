package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Airticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age,travel;
        double dist,fee;

        System.out.print("Mesafeyi KM türünden giriniz : ");
        dist = input.nextDouble();

        System.out.print("\nYaşınızı Giriniz : ");
        age = input.nextInt();

        System.out.print("\nYolculuk Tipini Seçiniz\n\n1 - Tek Yön\n2 - Gidiş - Dönüş \n\nTercih : ");
        travel = input.nextInt();

        if(dist < 0 || age < 0 || (travel != 1 && travel != 2)) {
            System.out.println("\nHatalı Veri Girdiniz !");
        }else {
            fee = dist * 0.10;

            //Yaş İndirimi
            if (age < 12) {
                fee *= 0.5;
            } else if (age >= 12 && age <= 24){
                fee *= 0.9;
            } else if (age >= 65) {
                fee *= 0.7;
            }

            if (travel == 2){
                fee *= 0.8;
                fee *= 2;
            }
            System.out.println("\nToplam Bilet Fiyatı : " + fee + "TL");
        }
        }
    }

