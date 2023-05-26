package Koşulluifadelervekodblokları;

import java.util.Scanner;

public class Numbersort {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int a,b,c;

        System.out.print("A sayısını giriniz ; ");
        a = input.nextInt();

        System.out.print("B sayısını giriniz ; ");
        b = input.nextInt();

        System.out.print("C sayısını giriniz ; ");
        c = input.nextInt();

        System.out.println("\nGirilen " + a + ","+ b + " ve " + c + " Sayılarının sıralaması ; ");

        if(a > b && a > c){
            if (b > c){
                System.out.println("c < b < a = " + c + " < " + b + " < " + a);
            }else{
                System.out.println("b < c < a = " + b + " < " + c + " < " + a);
            }
        }else if (b > a && b > c){
            if (a > c){
                System.out.println("c < a < b = " + c + " < " + a + " < " + b);
            }else{
                System.out.println("a < c < b = " + a + " < " + c + " < " + b);
            }
        } else{
            if (a > b){
                System.out.println("b < a < c = " + b + " < " + a + " < " + c);
            }else {
                System.out.println("a < b < c = " + a + " < " + b + " < " + c);
            }
        }
    }
        }
