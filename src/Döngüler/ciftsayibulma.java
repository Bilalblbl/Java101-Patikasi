package Döngüler;

import java.util.Scanner;

public class ciftsayibulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a ;

        System.out.print("Sayı Giriniz = ");
        a = input.nextInt();

        for(int i=1; i <= a; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
