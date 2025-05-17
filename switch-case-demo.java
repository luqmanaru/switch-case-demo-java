package com.mycompany.membacabilanganswitch;

import java.util.Scanner;

/**
 * Program Konversi Angka dengan Switch-Case
 * @author luqmanaru
 */
public class MembacaBilanganSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka antara 1-10: ");
        int angka = scanner.nextInt();

        switch (angka) {
            case 1 -> System.out.println("Satu");
            case 2 -> System.out.println("Dua");
            case 3 -> System.out.println("Tiga");
            case 4 -> System.out.println("Empat");
            case 5 -> System.out.println("Lima");
            case 6 -> System.out.println("Enam");
            case 7 -> System.out.println("Tujuh");
            case 8 -> System.out.println("Delapan");
            case 9 -> System.out.println("Sembilan");
            case 10 -> System.out.println("Sepuluh");
            default -> System.out.println("Invalid number");
        }
        
        scanner.close();
    }
}
