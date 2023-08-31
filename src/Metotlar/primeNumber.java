package Metotlar;

import java.util.Scanner;

public class primeNumber {
    static boolean isPrime(int num, int divisor) {
        if (num <= 2) {
            return (num == 2);
        }
        if (num % divisor == 0) {
            return false;
        }
        if (divisor * divisor > num) {
            return true;
        }
        return isPrime(num, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı Giriniz (Çıkmak için negatif sayı giriniz): ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            if (isPrime(number, 2)) {
                System.out.println(number + " bir asal sayıdır.");
            } else {
                System.out.println(number + " bir asal sayı değildir.");
            }
        }
    }
}
