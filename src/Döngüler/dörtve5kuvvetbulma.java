package Döngüler;

import java.util.Scanner;

public class dörtve5kuvvetbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.print("Sınır sayı belirleyiniz = ");
        a = input.nextInt();
        System.out.println(a + " sayısının 4 ile kuvvetleri ;");
        for (int i = 1 ;i <= a; i*=4){
            System.out.println(i);
        }
        System.out.println(a + " sayısının 5 ile kuvvetleri ;");
        for (int i = 1 ;i <= a; i*=5){
            System.out.println(i);
        }
    }
}
