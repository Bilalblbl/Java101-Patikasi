package Temelkavramlarvedeğişkenler;

import java.util.Scanner;

public class notOrtalaması {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Matematik Notunuzu Giriniz ; ");
        mat = not.nextInt();

        System.out.println("Fizik Notunuzu Giriniz ; ");
        fizik = not.nextInt();

        System.out.println("Kimya Notunuzu Giriniz ; ");
        kimya = not.nextInt();

        System.out.println("Türkce Notunuzu Giriniz ; ");
        turkce= not.nextInt();

        System.out.println("Tarih Notunuzu Giriniz ; ");
        tarih = not.nextInt();

        System.out.println("Müzik Notunuzu Giriniz ; ");
        muzik = not.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik ;
        double sonuc = toplam / 6 ;

        System.out.println("Ders Ortlamanız " + (sonuc) );
        boolean durum = sonuc >= 50;
        String str = durum ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";

        System.out.println("Sınıf Durumunuz ;  " + str);
    }
}
