package Temelkavramlarvedeğişkenler;

import java.util.Scanner;
public class kiloIndeks {
    public static void main(String[] args) {

        int b ;
        double a,sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Boy Giriniz (Metre Cinsinden) :");
        a = input.nextDouble();

        System.out.print("Kilo Giriniz : ");
        b = input.nextInt();

        sonuc = b/(a * a);
        System.out.println("Vücut Kitle Endeksiniz = " + sonuc);
    }
}
