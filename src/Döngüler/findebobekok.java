package Döngüler;

import java.util.Scanner;

public class findebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, i = 1, s = 1, ebob = 0, ekok = 0;

        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

//        if (n1 < n2) {
//            while (i <= n1) {
//                if (n1 % i == 0 && n2 % i == 0)
//                    ebob = i;
//                i++;
//            }
//            System.out.println(ebob);
//        } else if (n2 < n1) {
//            while (i <= n2) {
//                if (n1 % i == 0 && n2 % i == 0)
//                    System.out.println(i);
//                    ebob = i;
//                i++;
//            }
//
//        }

        int k = n1;
        if (n1 < n2) {
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Girilen rakamların Ekok'u : " + ebob);
                break;
            }
            k--;
        }
        } else if (n2 < n1) {
            while (k >= 1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    System.out.println("Girilen rakamların Ekok'u : " + ebob);
                    break;
                }
                k--;
            }
        }
            System.out.println();
//            ekok = (n1 * n2) / ebob;
//            System.out.println("Girilen rakamların Ekok'u : " + ekok);

        while (i <= (n1*n2)){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("Girilen rakamların Ebob'u : " + i);
                break;
            }
            i++;
        }
    }
}