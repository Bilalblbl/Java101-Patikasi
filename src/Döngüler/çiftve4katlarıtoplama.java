package Döngüler;

import java.util.Scanner;

public class çiftve4katlarıtoplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b = 0;

        do {
            System.out.print("Sayı Giriniz = ");
            a = input.nextInt();
            if (a % 2 == 0 || a % 4 == 0) {
                b += a;
            }
        }while (a % 2 == 0); System.out.println (a + " Tek sayı olduğundan işlem sonlandırıldı.");

        System.out.println("Girilen Çift Sayıların Toplamı = " + b);
    }
}