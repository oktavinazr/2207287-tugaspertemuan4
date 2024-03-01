/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3_pert4;

/**
 * @author Oktavina Zahra R
 */
import java.util.Scanner;

public class Soal3_Pert4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Maaf, nilai n harus positif.");
        } else {
            long faktorial = hitungFaktorial(n);

            tampilkanFaktorial(n, faktorial);
        }
    }

    private static long hitungFaktorial(int n) {
        long hasil = 1;

        for (int i = n; i > 0; i--) {
            hasil *= i;
        }

        return hasil;
    }

    private static void tampilkanFaktorial(int n, long hasil) {
        System.out.print(n + "! = ");

        for (int i = n; i > 0; i--) {
            System.out.print(i);

            if (i > 1) {
                System.out.print(" * ");
            }
        }

        System.out.println(" = " + hasil);
    }
    
}
