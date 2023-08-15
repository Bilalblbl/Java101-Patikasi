package Metotlar;

import java.util.Scanner;

public class palindromNumber {
    static boolean isPalindrom(int number){
        int temp = number,reverseNumber = 0,lastNumber=0;

        while (temp != 0){

            lastNumber = temp % 10;

            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /=10;
        }

        System.out.println("\nGirilem Sayı = " + number);
        System.out.println("Çevirilen Yeni Sayı = " + reverseNumber +"\n");

        if (number == reverseNumber){
            System.out.println(number + " Bir Palindrom Sayıdır.");
            return true;
        }else{
            System.out.println(number + " Bir Palindrom Sayı değildir.");
            return false;
        }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Tersine Çevirmek İstediğiniz Sayıyı Giriniz = ");
        num = input.nextInt();

        isPalindrom(num);
    }
}
