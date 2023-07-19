package Döngüler;

import java.util.Scanner;

public class basamaktoplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, basValue, result = 0;

        System.out.print("Rakam giriniz : ");
        number = input.nextInt();

        while (number != 0) {
            basValue = number % 10;

            result += basValue;

            System.out.print(basValue);
            number /= 10;

            if (number != 0) {
                System.out.print(" + ");
            }
        }
        System.out.println(" : " + result);
    }
}
