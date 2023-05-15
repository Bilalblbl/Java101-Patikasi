package Work;

import java.util.Scanner;
public class ucgendeHipotenusHesabi {
    public static void main(String[] args) {

        int akenar,bkenar;
        double alan ;
        //Kullanıcıdan A ve B kenarları alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("A kenarını giriniz = ");
        akenar = input.nextInt();

        System.out.print("B kenarını giriniz = ");
        bkenar = input.nextInt();

        alan = Math.sqrt((akenar*akenar)+(bkenar*bkenar));
        System.out.println("Hipotenüs = " + alan);
    }
}
