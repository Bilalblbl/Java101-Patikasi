package Metotlar;
import java.util.Scanner;

public class recursivePow {
  static int f(int a,int b){

    int result = 1;
    if (a == 0 || b == 0){
      System.out.println("\n0 girilemez");
    }else {
    for (int i = 1 ; i <= b; i++){
      result *= a;
    }
    System.out.println("\nSonuç : " + result);}
      return result;
  }

  public static void main(String[] args) {
    Scanner tnum = new Scanner(System.in);
    System.out.print("Taban Değeri Giriniz : ");
    int taban =  tnum.nextInt();
    System.out.print("Üs Değeri Giriniz : ");
    int üs =  tnum.nextInt();
    f(taban,üs);

  }
}
