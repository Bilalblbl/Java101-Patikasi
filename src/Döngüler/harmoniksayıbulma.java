package Döngüler;

import java.util.Scanner;

public class harmoniksayıbulma {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        int a;
        double result=0;

        System.out.print("A Sayısını giriniz : ");
        a = input.nextInt();

        for (double i = 1; i <= a; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
