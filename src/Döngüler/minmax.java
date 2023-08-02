package Döngüler;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,i=1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        a = input.nextInt();

        do {
            System.out.print(i + ". sayıyı giriniz :");
            b =input.nextInt();

            if (b < min) {
                min = b;
            }

            if (b > max) {
                max = b;
            }
            i++;
            a--;

        }while (0 < a);

        System.out.println("\nEn küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
