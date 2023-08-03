package Döngüler;

import java.util.Scanner;

public class ınvertedTriangle {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Basamak sayısını girin: ");
    int basamakSayisi = scanner.nextInt();

    // İlk döngü, satırları yönetmek için
    for (int i = basamakSayisi; i >= 1; i--) {
        // İkinci döngü, her satırdaki yıldızları yönetmek için
        for (int j = 1; j <= basamakSayisi - i; j++) {
            System.out.print(" "); // Boşlukları ekrana yazdır
        }
        for (int k = 1; k <= i * 2 - 1; k++) {
            System.out.print("*"); // Yıldızları ekrana yazdır
        }
        System.out.println(); // Her satırın sonunda yeni bir satıra geç
    }
    scanner.close();
}
}