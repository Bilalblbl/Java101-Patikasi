package Döngüler;

import java.util.Scanner;

public class armstrongsayibulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, c, basNumber = 0, basValue, üs, rakam = 0,result = 0,basPow;

        System.out.print("Sayı Gİriniz : ");
        number = input.nextInt();

        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            rakam++;
            basValue = tempNumber % 10;
            System.out.println("Rakam " + rakam + ": " + basValue);
            basPow = 1;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result+=basPow;
            System.out.println(basValue + " Rakamının üssü : " +basPow + "\n");
            tempNumber /= 10;
        }

        if( result == number){
            System.out.println(number + " Sayısı bir Armstrong sayıdır.");
        }else{
            System.out.println(number + " Sayısı bir Armstrong sayı değildir.");
        }


    }
}
