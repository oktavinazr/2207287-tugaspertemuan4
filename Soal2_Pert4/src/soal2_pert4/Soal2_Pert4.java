/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2_pert4;

/**
 * @author Oktavina Zahra R
 */
import java.util.Scanner;

public class Soal2_Pert4 {

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);

        System.out.print("Masukkan batas awal bilangan: ");
        int batasAwal = bilangan.nextInt();

        System.out.print("Masukkan batas akhir bilangan: ");
        int batasAkhir = bilangan.nextInt();

        int banyakGanjil = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                banyakGanjil++;
            }
        }
        
        System.out.println("\nBanyaknya bilangan ganjil");
        System.out.println("dari " + batasAwal + " - " + batasAkhir + " adalah: " + banyakGanjil);
    }
    
}

