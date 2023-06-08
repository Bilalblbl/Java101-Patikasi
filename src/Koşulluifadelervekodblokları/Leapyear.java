package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Hesaplamak istediğiniz yılı giriniz : ");
        year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 ||  year % 400 == 0 ){
            System.out.println(year + " Artık bir yıldır.");
        }else {
            System.out.println(year + " Artık bir yıl değildir.");
        }
    }
}
