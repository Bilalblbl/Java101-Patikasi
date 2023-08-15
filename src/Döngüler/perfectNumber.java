package Döngüler;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, total = 0;

        System.out.print("Sayı Giriniz ; ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && i != a) {
                total += i;
            }
        }
        if (total == a){
            System.out.print(a + " bir mükemmel sayıdır çünkü pozitif tam sayı çarpanları (kalansız bölenleri) olan sayıların toplamı " + total + " olur.");
        }else {
            System.out.println(a + " bir mükemmel sayı değildir çünkü pozitif tam sayı çarpanları (kalansız bölenleri) olan sayıların toplamı " + total + " olur.");
        }
    }
}