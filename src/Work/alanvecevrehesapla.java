package Work;

import java.util.Scanner;
public class alanvecevrehesapla {
    public static void main(String[] args) {

        int r,a;
        double pi = 3.14 , alan , cevre , dilim;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapı = ");
        r = input.nextInt();

        System.out.print("Merkez Açı Ölçüsü = ");
        a = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilim = (pi * (r*r) * a) / 360;
        System.out.println("Yarı çapı " + r + " olan dairenin alanı " + alan + " olur");
        System.out.println("Yarı çapı " + r + " olan dairenin cevresi " + cevre + " olur");
        System.out.println("Yarı çapı " + r + " Merkez açı ölçüsü " + a + " olan daire diliminin alanı " + dilim + " olur");
    }
}
