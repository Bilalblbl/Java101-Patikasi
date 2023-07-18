package Döngüler;

import java.util.Scanner;

public class uslusayihesapla {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,total = 1;

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        a = inp.nextInt();

        System.out.print("Üs olacak sayıyı giriniz : ");
        b = inp.nextInt();

        for (int i = 1 ; i <=b ; i++){
            total *= a;
        }
        System.out.println("Cevap : " + total);
    }
}
