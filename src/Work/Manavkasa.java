package Work;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Manavkasa {
    public static void main(String[] args) {

        double a, b, c, d, e ,tutar=0.00f;


        Scanner input = new Scanner(System.in);

        System.out.print("Alınan Armut Kaç Kg? : ");
        a = input.nextDouble();

        System.out.print("Alınan Elma Kaç Kg? : ");
        b = input.nextDouble();

        System.out.print("Alınan Domates Kaç Kg? : ");
        c = input.nextDouble();

        System.out.print("Alınan Muz Kaç Kg? : ");
        d = input.nextDouble();

        System.out.print("Alınan Patlıcan Kaç Kg? : ");
        e = input.nextDouble();

        tutar = (a * 2.14) + (b * 3.67) + (c * 1.11) + (d * 0.95) + (e * 5.00);

        System.out.println("Toplam Alışveriş Tutarı : " +tutar);

    }
}
