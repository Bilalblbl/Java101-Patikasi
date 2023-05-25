package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class classstatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mat, fizik, trkc, kimya, mzk, ort;

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Matematik notunuz geçersiz. Ortalamaya alınmayacak.");
            mat = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Fizik notunuz geçersiz. Ortalamaya alınmayacak.");
            fizik = 0;
        }

        System.out.print("Türkçe Notunuzu Giriniz : ");
        trkc = input.nextInt();
        if (trkc < 0 || trkc > 100) {
            System.out.println("Türkçe notunuz geçersiz. Ortalamaya alınmayacak.");
            trkc = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Kimya notunuz geçersiz. Ortalamaya alınmayacak.");
            kimya = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz : ");
        mzk = input.nextInt();
        if (mzk < 0 || mzk > 100) {
            System.out.println("Müzik notunuz geçersiz. Ortalamaya alınmayacak.");
            mzk = 0;
        }

        ort = (mat+fizik+trkc+kimya+mzk)/5;


        if (ort >= 55){
            System.out.println("\n" + ort + " ortalama ile sınıfı geçtiniz. Başarılar...");
        }else{
            System.out.println("\n" + ort + " Ortalama ile sınıfta kaldınız. Seneye tekrar görüşmek üzere...");
        }


    }
}
