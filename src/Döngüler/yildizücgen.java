package Döngüler;

import java.util.Scanner;

public class yildizücgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.print("Basamak Sayısını Giriniz : ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= (a-i) ; b++){
                System.out.print(" ");
            }for (int c = 1; c <= (2*i) - 1; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
