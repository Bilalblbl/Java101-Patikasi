package Döngüler;

import java.util.Scanner;

public class ciftsayibulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, i = 1;

        System.out.print("Sayı Giriniz = ");
        a = input.nextInt();

        while (i <= a) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        }
    }
}

