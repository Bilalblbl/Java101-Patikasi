package Metotlar;
import java.util.Scanner;

public class recursivePow {
  static void us(){
    Scanner tnum = new Scanner(System.in);
    System.out.print("Taban Değeri Giriniz : ");
    int taban =  tnum.nextInt();
    System.out.print("Üs Değeri Giriniz : ");
    int üs =  tnum.nextInt();
    int result = 1;

    if (üs == 0 || taban == 0){
      System.out.println("\n0 girilemez");
    }else {
    for (int i = 1 ; i <= üs; i++){
      result *= taban;
    }
    System.out.println("\nSonuç : " + result);}
  }

    public static void main(String[] args) {
    us();
    }
}
