package Döngüler;

import java.util.Scanner;

public class kombinasyonbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r,result;
        int total = 1, ntotal = 1, rtotal = 1,nrtotal = 1;

        System.out.print("N sayısını giriniz : ");
        n = input.nextInt();

        System.out.print("R sayısını giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            ntotal = ntotal * i;
        }
        System.out.println(n + " Sayısın faktöriyel değeri " + ntotal + ";");

        for (int i = 1; i <= r; i++) {
            rtotal = rtotal * i;
        }
        System.out.println(r + " Sayısın faktöriyel değeri " + rtotal + ";");

        for (int i = 1; i <=(n-r);i++){
            nrtotal = nrtotal * i;
        }
        System.out.println(n + "-" + r + " değerinin sonucu olan " + (n-r) + "! değerinin Faktöriyel değeri : " + nrtotal + ";");

        result=ntotal/(rtotal*nrtotal);

        System.out.println("C(n,r)=n!/(r!*(n-r)!): " +"İşlemin Sonucu: " + result + ".");

    }
}
