package Work;

import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {

        int a;
        double toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Mesafe = ");
        a = input.nextInt();

        toplam = (a * 2.20) + 10 ;

        //boolean srt = toplam > 20 ; 
        toplam = toplam > 20 ? toplam : 20;

        System.out.println("Toplam Tutar = " + toplam + "TL");
    }
}
