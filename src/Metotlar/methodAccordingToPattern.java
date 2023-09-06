package Metotlar;

import java.util.Scanner;

public class methodAccordingToPattern {
    public static int pattern(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
            pattern(n - 5); // 5 çıkar
            System.out.print(n + " ");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();
        System.out.println(pattern(n));
    }
}
