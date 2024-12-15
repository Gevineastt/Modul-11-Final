package modul7;

import java.util.Scanner;

public class Modul11no4 { 
    public static void main(String[] args) {
        int[] skor = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 5 data dengan tipe data integer");

        // Membaca 5 data yang bertipe bulat 
        for (int i = 0; i < 5; i++) {
            skor[i] = input.nextInt();
        }

        // Menampilkan data yang dimasukkan
        System.out.println("Data yang dimasukkan:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Data ke " + (i + 1) + " adalah " + skor[i]);
        }

        // Menghitung rata-rata, nilai maksimum, dan nilai minimum
        int sum = 0;
        int max = skor[0];
        int min = skor[0];

        for (int i = 0; i < 5; i++) {
            sum += skor[i];
            if (skor[i] > max) {
                max = skor[i];
            }
            if (skor[i] < min) {
                min = skor[i];
            }
        }

        double average = sum / 5.0;

        // Menampilkan hasil
        System.out.println("Rata-rata: " + average);
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);

        input.close();
    }
}