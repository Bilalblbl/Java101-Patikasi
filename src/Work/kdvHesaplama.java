package Work;

import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fiyat, kdv , kdvmiktar;

        System.out.print("Ürün Fiyatını Giriniz = ");
        fiyat = input.nextDouble();

        boolean kdvOrani = 0 < fiyat && fiyat <= 1000 ;
        kdv = kdvOrani ? 0.18 : 0.08;

        double kdvfiyat = fiyat * kdv;

        double kdvdahil = kdvfiyat + fiyat ;

        System.out.println("KDV'siz Fiyat = " + fiyat);
        System.out.println("KDV Oranı = " + kdv);
        System.out.println("KDV Tutarı = " + kdvfiyat);
        System.out.println("KDV Dahil Fiyatı = " + kdvdahil);
    }
}
