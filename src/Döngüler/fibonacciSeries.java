package Döngüler;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int n ;
        int firstNum = 0;
        int secondNum = 1;

        System.out.print("N eleman sayısını giriniz : ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = firstNum + secondNum;
            System.out.println(firstNum + " + " + secondNum + " = " + sum);
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}